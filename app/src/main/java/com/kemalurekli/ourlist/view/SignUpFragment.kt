package com.kemalurekli.ourlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.kemalurekli.ourlist.R
import com.kemalurekli.ourlist.databinding.FragmentSignUpBinding
import com.kemalurekli.ourlist.viewmodel.SignUpFragmentViewModel

class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    private lateinit var viewModel : SignUpFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[SignUpFragmentViewModel::class.java]
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}