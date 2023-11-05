package com.example.horscapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horscapp.R
import com.example.horscapp.databinding.FragmentHoroscopeBinding
import com.example.horscapp.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {



    private lateinit var mBinding : FragmentLuckBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentLuckBinding.inflate(inflater, container, false)
        return mBinding.root
    }


}