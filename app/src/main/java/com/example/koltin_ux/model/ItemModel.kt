package com.example.koltin_ux.model

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.koltin_ux.R

data class ItemModel(
    val title: String,
    val raw: Int,
    val description: String,
    val isSpecial: Boolean
) {

    @BindingAdapter("app:goneUnless")
    fun goneUnless(view: View, visible: Boolean) {
        view.visibility = if (visible) View.VISIBLE else View.GONE
    }

   /* @BindingAdapter("android:onClick")
    fun setOnClick(view: View, model: ItemModel, context: Context) {
        view.background = ContextCompat.getDrawable(context, R.drawable.greyfilled);


    }*/
}