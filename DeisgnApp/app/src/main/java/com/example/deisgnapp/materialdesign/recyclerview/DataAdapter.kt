package com.example.deisgnapp.materialdesign.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.deisgnapp.R

class DataAdapter(val context: Context, val dataModelList: ArrayList<DataModel>)
    :RecyclerView.Adapter<DataAdapter.MyViewHolder>(){
   inner  class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
    var name:TextView=view.findViewById(R.id.txtName)
       var dip:TextView=view.findViewById(R.id.txtDip)
       var salary:TextView=view.findViewById(R.id.txtSalary)
       var image:ImageView=view.findViewById(R.id.img)

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapter.MyViewHolder {

   val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_dataadpter,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: DataAdapter.MyViewHolder, position: Int) {
        val data=dataModelList[position]

        holder.name.text=data.name
        holder.dip.text=data.dip
        holder.salary.text=data.salary.toString()
        Glide.with(context).load(data.images).into(holder.image)

    }

    override fun getItemCount(): Int {
        return dataModelList.size
    }
}