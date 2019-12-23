package com.example.matchthecards.gamefragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.matchthecards.R
import com.example.matchthecards.databinding.FragmentGameBinding
import com.example.matchthecards.model.Products
import com.example.matchthecards.model.ProductsObject


class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentGameBinding.inflate(inflater,container,false)
        binding.gameVm = ViewModelProviders.of(this).get(GameViewModel::class.java).also { view ->
            view.productList.observe(this, Observer<List<Products>> { list ->
                if(list.isNotEmpty()){
                    view.setProductsAdapter(list)
                    setRecyclerViewProperties()
                }
            })
        }


        binding.lifecycleOwner = this

        return binding.root
    }


    fun setRecyclerViewProperties() {
        binding.productListView.setHasFixedSize(true)
        binding.productListView.layoutManager = GridLayoutManager(context ,5)

    }
}
