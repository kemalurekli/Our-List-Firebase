package com.kemalurekli.ourlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.kemalurekli.ourlist.R
import com.kemalurekli.ourlist.databinding.FragmentSignInBinding
import com.kemalurekli.ourlist.viewmodel.SignInFragmentViewModel


class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSignInBinding
    private lateinit var viewModel : SignInFragmentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[SignInFragmentViewModel::class.java]
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}