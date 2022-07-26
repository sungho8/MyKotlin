package com.thecommerce.matchingbox.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thecommerce.matchingbox.databinding.RcvItemBinding
import com.thecommerce.matchingbox.model.Data

class ProfileAdapter () : RecyclerView.Adapter<ProfileViewHolder>(){
    var data = listOf<Data>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding = RcvItemBinding.inflate(
            LayoutInflater.from(parent.context), parent,false)

        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}