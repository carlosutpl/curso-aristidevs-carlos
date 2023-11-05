package com.example.horscapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horscapp.R
import com.example.horscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {
    private lateinit var mBinding : FragmentHoroscopeBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentHoroscopeBinding.inflate(inflater, container, false)
        return mBinding.root
    }


}