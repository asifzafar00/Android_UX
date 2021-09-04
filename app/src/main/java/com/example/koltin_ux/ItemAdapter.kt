package com.example.koltin_ux

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.koltin_ux.databinding.SizeRowViewBinding
import com.example.koltin_ux.model.ItemModel

class ItemAdapter(var context: Context,  val list: List<ItemModel>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: SizeRowViewBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.size_row_view, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    // Bind data
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

     holder.bind(list[position])
    }


    // Creating ViewHolder
   inner class ViewHolder(val binding: SizeRowViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.model, data) //BR - generated class; BR.user -- 'user' is variable name declared in layout
            binding.executePendingBindings()
            try {
                binding.size.background = ContextCompat.getDrawable(context, list[adapterPosition].raw)
            } catch (e: Exception) {
            }

            binding.size.setOnClickListener {
                var isView = false
               if(isView){
                   binding.size.background = ContextCompat.getDrawable(context, R.drawable.greyfilled)
                   isView=true
               }
                else{
                   binding.size.background = ContextCompat.getDrawable(context, R.drawable.greyborder);
                   isView=false

               }




            }
        }
    }

}