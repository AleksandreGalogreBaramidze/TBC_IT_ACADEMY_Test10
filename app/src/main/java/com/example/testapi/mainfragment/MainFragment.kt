package com.example.testapi.mainfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapi.adapters.FirstRecyclerAdapter
import com.example.testapi.adapters.SecondRecyclerAdapter
import com.example.testapi.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding
    private lateinit var firstAdapter: FirstRecyclerAdapter
    private lateinit var secondAdapter: SecondRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }
    private fun init(){
        viewModel.init()
        initRecycler()
    }
    private fun initRecycler(){
        firstAdapter = FirstRecyclerAdapter()
        binding.FirstRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.FirstRecycler.adapter = firstAdapter
        secondAdapter = SecondRecyclerAdapter()
        binding.SecondRecycler.layoutManager =  LinearLayoutManager(requireContext())
        binding.SecondRecycler.adapter = secondAdapter
    }
}