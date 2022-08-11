package com.jimmy.mainstreamapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jimmy.mainstreamapp.databinding.FragmentIsdnBinding


class IsdnFragment : Fragment() {

    private lateinit var binding: FragmentIsdnBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_isdn,container,false)

        return binding.root
    }


}