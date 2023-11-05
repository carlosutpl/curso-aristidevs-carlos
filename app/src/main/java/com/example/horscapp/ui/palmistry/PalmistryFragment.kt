package com.example.horscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horscapp.R
import com.example.horscapp.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {


    private lateinit var mBinding : FragmentPalmistryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentPalmistryBinding.inflate(inflater, container, false)
        return mBinding.root
    }

}