package com.kemalurekli.ourlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.kemalurekli.ourlist.R
import com.kemalurekli.ourlist.databinding.FragmentDetailsBinding
import com.kemalurekli.ourlist.databinding.FragmentHomeBinding
import com.kemalurekli.ourlist.viewmodel.DetailsFragmentViewModel
import com.kemalurekli.ourlist.viewmodel.HomeFragmentViewModel

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private lateinit var viewModel : DetailsFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[DetailsFragmentViewModel::class.java]
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

}