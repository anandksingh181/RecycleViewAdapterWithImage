package com.example.recycleviewadapterwithimage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewadapterwithimage.databinding.EachItemBinding

class RvAdapter(var dataList : ArrayList<RvModel> ) : RecyclerView.Adapter<RvAdapter.RvViewHolder>() {
    class RvViewHolder(var binding: EachItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        return RvViewHolder(EachItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.binding.image.setImageResource(dataList.get(position).image)
        holder.binding.name.text =dataList.get(position).name
        holder.binding.number.text = dataList.get(position).phoneNumber
        holder.binding.address.text = dataList.get(position).address

    }
}