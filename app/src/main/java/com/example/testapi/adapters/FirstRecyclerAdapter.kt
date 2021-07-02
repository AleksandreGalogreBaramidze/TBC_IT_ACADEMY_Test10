package com.example.testapi.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapi.databinding.FirstInnerrecyclerItemBinding
import com.example.testapi.models.Topic

class FirstRecyclerAdapter : RecyclerView.Adapter<FirstRecyclerAdapter.ViewHolder>()  {
    val data: MutableList<Topic> = mutableListOf()
    private lateinit var topic: Topic
    fun dataSetter(data: MutableList<Topic>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = FirstInnerrecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
    }
    override fun getItemCount() = data.size

    inner class ViewHolder(private val binding: FirstInnerrecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind() {
        }
    }

}