package com.thecommerce.matchingbox.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.thecommerce.matchingbox.model.Data

object ProfileBindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun setItems(recyclerView : RecyclerView, items : ArrayList<Data>){
        if(recyclerView.adapter == null){
            val adapter = ProfileAdapter()
            adapter.setHasStableIds(true)
            recyclerView.adapter = adapter
        }

        val myAdapter = recyclerView.adapter as ProfileAdapter

        myAdapter.data = items
        myAdapter.notifyDataSetChanged()
    }
}