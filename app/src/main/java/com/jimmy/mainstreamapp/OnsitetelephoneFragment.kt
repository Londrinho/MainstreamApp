package com.jimmy.mainstreamapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jimmy.mainstreamapp.databinding.FragmentOnsitetelephoneBinding


class OnsitetelephoneFragment : Fragment() {
    private lateinit var binding: FragmentOnsitetelephoneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_onsitetelephone, container, false)

        return binding.root
    }


}