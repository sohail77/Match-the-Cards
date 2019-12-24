package com.example.matchthecards.menufragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

import com.example.matchthecards.R
import com.example.matchthecards.databinding.FragmentMenuBinding
import kotlinx.android.synthetic.main.fragment_menu.*

const val COLUMN_SIZE = "size"
const val DIFFICULTY_LEVEL = "difficulty"

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    private var colSize = 5
    private lateinit var difficultyLevel : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMenuBinding.inflate(inflater,container,false)
        binding.menuVm = ViewModelProviders.of(this).get(MenuViewModel::class.java).also { view ->
            view.difficultyLevel.observe(this, Observer { difficulty ->
                when (difficulty) {
                    "Legend" -> plus_diff.isClickable = false
                    "Amateur" -> minus_diff_img.isClickable = false
                    else -> {
                        plus_diff.isClickable = true
                        minus_diff_img.isClickable = true
                    }
                }
                difficultyLevel = difficulty
            })

            view.columnSize.observe(this, Observer { size ->
                when {
                    size == 7 -> plus_col_img.isClickable = false
                    size <= 5 -> minus_col_img.isClickable = false
                    else -> {
                        plus_col_img.isClickable = true
                        minus_col_img.isClickable = true
                    }
                }
                colSize = size
            })
        }

        binding.playBtn.setOnClickListener { navigateToGame() }
        binding.lifecycleOwner = this
        return binding.root
    }

    private fun navigateToGame() {
        findNavController().navigate(R.id.action_menuFragment_to_gameFragment,
            bundleOf(
                DIFFICULTY_LEVEL to difficultyLevel,
                COLUMN_SIZE to colSize
            ),null,null)
    }
}
