package com.example.testapi.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapi.databinding.SecondInnerrecyclerItemBinding
import com.example.testapi.extensions.loadImage
import com.example.testapi.models.Course

class SecondRecyclerAdapter : RecyclerView.Adapter<SecondRecyclerAdapter.ViewHolder>()  {
    val data: MutableList<Course> = mutableListOf()
    private lateinit var course: Course
    fun dataSetter(data: MutableList<Course>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondRecyclerAdapter.ViewHolder {
        val itemView = SecondInnerrecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }
    override fun getItemCount() = data.size

    inner class ViewHolder(private val binding: SecondInnerrecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind() {
            binding.textView5.text = course.title
            binding.imageView.loadImage(course.image)
        }
    }

    override fun onBindViewHolder(holder: SecondRecyclerAdapter.ViewHolder, position: Int) {
        holder.onBind()
    }
}