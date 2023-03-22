package com.ncrdesarrollo.apinasa.apodo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.ncrdesarrollo.apinasa.databinding.FragmentApodoBinding

class ApodoFragment : Fragment() {

    private var _binding: FragmentApodoBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ApodoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentApodoBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getApodo()
        viewModel.responseApodoModel.observe(viewLifecycleOwner) {
            with(binding) {
                Glide.with(requireActivity())
                    .load(it.url)
                    .into(imageViewApodo)
                textViewDate.text = it.date
                textViewExplanation.text = it.explanation
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
