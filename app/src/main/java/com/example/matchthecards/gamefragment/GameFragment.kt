package com.example.matchthecards.gamefragment


import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.transition.ChangeBounds
import androidx.transition.TransitionInflater
import com.example.android.diceroller.ShakeDetector
import com.example.matchthecards.R
import com.example.matchthecards.api.COLUMN_SIZE
import com.example.matchthecards.api.DIFFICULTY_LEVEL
import com.example.matchthecards.databinding.FragmentGameBinding
import com.example.matchthecards.model.Products


class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var detector: ShakeDetector
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(inflater, container, false)

        //transition
        val transition =
            TransitionInflater.from(this.activity).inflateTransition(android.R.transition.move)

        sharedElementEnterTransition = ChangeBounds().apply {
            enterTransition = transition
        }


        // bind the ViewModel with the Fragment
        binding.gameVm = ViewModelProviders.of(this).get(GameViewModel::class.java).also { view ->
            //Whenever data in productList is changed, recycler view is updated
            view.productList.observe(this, Observer<List<Products>> { list ->
                if (list.isNotEmpty()) {
                    view.setDifficultyLevel(determineDifficultyLevel())
                    view.setProductsAdapter(list)
                    setRecyclerViewProperties()
                }
            })

            //Show the Winner UI
            view.winner.observe(this, Observer { winner -> showTheWinner(winner) })
        }

        detector = ShakeDetector(activity)

        //Check if shake detection is possible
        if (!detector.isSupported()) {
            Toast.makeText(context, "Sensor not detected cannot shuffle", Toast.LENGTH_LONG).show()
        }

        finsihGame()
        binding.infoImg.setOnClickListener { createDialog().show() }
        binding.lifecycleOwner = this

        return binding.root
    }


    /**
     * Set the recycler views properties
     */
    private fun setRecyclerViewProperties() {
        val size = arguments?.getInt(COLUMN_SIZE) as Int
        binding.productListView.setHasFixedSize(true)
        binding.productListView.layoutManager = GridLayoutManager(context, size)

    }

    /**
     * We only want to listen for shake events when the fragment is visible
     */
    override fun onResume() {
        super.onResume()
        if (detector.isSupported())
            detector.startListening(object : ShakeDetector.ShakeListener {
                override fun onShake(force: Float) = binding.gameVm?.shuffleCards()
            })
    }

    /**
     * Stop listening for shake events when the fragment is not visible
     */
    override fun onPause() {
        detector.stopListening()
        super.onPause()
    }

    private fun determineDifficultyLevel(): Int {
        return when (arguments?.get(DIFFICULTY_LEVEL)) {
            "Legend" -> 4
            "Amateur" -> 2
            else -> 3
        }
    }

    /**
     * Hide the cards and Show the Winner UI
     */
    @SuppressLint("RestrictedApi")
    private fun showTheWinner(winner: String) {
        binding.productListView.visibility = View.GONE
        binding.player1Layout.visibility = View.GONE
        binding.player2Layout.visibility = View.GONE
        binding.infoImg.visibility = View.GONE
        binding.winnerAnimation.visibility = View.VISIBLE
        binding.winnerAnimation.playAnimation()
        binding.winnerTxt.visibility = View.VISIBLE
        binding.winnerTxt.text = winner
        binding.goBackBtn.visibility = View.VISIBLE
    }

    private fun finsihGame() {
        binding.goBackBtn.setOnClickListener { findNavController().navigate(R.id.action_gameFragment_to_menuFragment) }
    }

    /**
     * Create a dialog to show the user, how to shuffle cards.
     */
    private fun createDialog() : AlertDialog {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Shuffle Cards!!")
        builder.setMessage("Shake the Device to shuffle the cards")
        builder.setIcon(R.drawable.ic_shuffle_black_24dp)
        builder.setCancelable(true)
        builder.setPositiveButton("Ok got it!",
            DialogInterface.OnClickListener {dialog, which ->
                dialog.cancel()
            }
        )
        return builder.create()
    }

}
