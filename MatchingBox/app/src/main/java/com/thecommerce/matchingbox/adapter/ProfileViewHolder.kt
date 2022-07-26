package com.thecommerce.matchingbox.adapter

import androidx.recyclerview.widget.RecyclerView
import com.thecommerce.matchingbox.databinding.RcvItemBinding
import com.thecommerce.matchingbox.model.Data

class ProfileViewHolder (val binding : RcvItemBinding) : RecyclerView.ViewHolder(binding.root){
    fun onBind(data : Data){
        binding.user = data
    }
}