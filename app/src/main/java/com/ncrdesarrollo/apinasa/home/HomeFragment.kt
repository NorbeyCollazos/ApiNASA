package com.ncrdesarrollo.apinasa.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ncrdesarrollo.apinasa.R
import com.ncrdesarrollo.apinasa.databinding.FragmentHomeBinding
import java.util.ArrayList

class HomeFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapterHome: RecyclerHomeAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun getOptionsMenu(): MutableList<InfoHomeData> {
        var options: MutableList<InfoHomeData> = ArrayList()
        options.add(InfoHomeData(R.drawable.ic_image, "APODO", "Imagen astronómica del día", OptionsMenu.APODO))
        options.add(InfoHomeData(android.R.drawable.star_on, "Primer diseño", "Esta es la descripción del primer diseño", OptionsMenu.DESING_2))
        options.add(InfoHomeData(R.drawable.ic_arrow_down, "Primer diseño", "Esta es la descripción del primer diseño", OptionsMenu.DESING_3))
        return options
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        setAdapter()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapterHome.setListOptionsHome(getOptionsMenu())
        adapterHome.notifyDataSetChanged()
    }

    private fun setAdapter() {
        adapterHome = RecyclerHomeAdapter {
            when (it.enum) {
                OptionsMenu.APODO -> findNavController().navigate(R.id.apodoFragment, null)
            }
        }
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = adapterHome
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
