package com.example.matchthecards.gamefragment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.android.diceroller.ShakeDetector
import com.example.matchthecards.R
import com.example.matchthecards.databinding.FragmentGameBinding
import com.example.matchthecards.menufragment.COLUMN_SIZE
import com.example.matchthecards.menufragment.DIFFICULTY_LEVEL
import com.example.matchthecards.model.Products


class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var detector: ShakeDetector
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentGameBinding.inflate(inflater,container,false)
        binding.gameVm = ViewModelProviders.of(this).get(GameViewModel::class.java).also { view ->
            view.productList.observe(this, Observer<List<Products>> { list ->
                if(list.isNotEmpty()){
                    view.setDifficultyLevel(determineDifficultyLevel())
                    view.setProductsAdapter(list)
                    setRecyclerViewProperties()
                }
            })

            view.winner.observe(this, Observer { winner -> showTheWinner(winner) })
        }

        detector = ShakeDetector(activity)

        if (!detector.isSupported()) {
            Toast.makeText(context, "Sensor not detected cannot shuffle",Toast.LENGTH_LONG).show()
        }

        finsihGame()
        binding.lifecycleOwner = this

        return binding.root
    }


    private fun setRecyclerViewProperties() {
        val size = arguments?.getInt(COLUMN_SIZE) as Int
        binding.productListView.setHasFixedSize(true)
        binding.productListView.layoutManager = GridLayoutManager(context ,size)

    }

    override fun onResume() {
        super.onResume()
        if (detector.isSupported())
            detector.startListening( object : ShakeDetector.ShakeListener {
                override fun onShake(force: Float) = binding.gameVm?.shuffleCards()
            })
    }

    override fun onPause() {
        detector.stopListening()
        super.onPause()
    }

    private fun determineDifficultyLevel() : Int {
        val diff = arguments?.get(DIFFICULTY_LEVEL)
        when (diff) {
            "Legend" -> return 4
            "Amateur" -> return 2
            else -> return 3
        }
    }

    @SuppressLint("RestrictedApi")
    private fun showTheWinner(winner: String) {
        binding.productListView.visibility = View.GONE
        binding.player1Layout.visibility = View.GONE
        binding.player2Layout.visibility = View.GONE
        binding.winnerAnimation.visibility = View.VISIBLE
        binding.winnerAnimation.playAnimation()
        binding.winnerTxt.visibility = View.VISIBLE
        binding.winnerTxt.text = winner
        binding.goBackBtn.visibility = View.VISIBLE
    }

    private fun finsihGame() {
        binding.goBackBtn.setOnClickListener { findNavController().navigate(R.id.action_gameFragment_to_menuFragment) }
    }

}
