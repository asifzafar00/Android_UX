package com.example.koltin_ux


import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.koltin_ux.model.ItemModel
import kotlinx.android.synthetic.main.dressview.*


class MainActivity : AppCompatActivity() {

    private var userList = ArrayList<ItemModel>()
    private var colorList = ArrayList<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dressview)

        loadData()
        setAdapter()
    }

    private fun loadData() {
        userList.add(ItemModel("Riya", 1, "XS", true))
        userList.add(ItemModel("Percy", 1, "S", false))
        userList.add(ItemModel("Ron", 1, "M", true))
        userList.add(ItemModel("Prachi", 1, "XL", false))
        userList.add(ItemModel("Leo",1, "XXL", true))
        userList.add(ItemModel("Luke", 1, "XXXL", false))

        colorList.add(ItemModel("Riya", R.drawable.colorred, "", true))
        colorList.add(ItemModel("Percy", R.drawable.colororange, "", false))
        colorList.add(ItemModel("Ron", R.drawable.colorblack, "", true))
        colorList.add(ItemModel("Prachi", R.drawable.colorblue, "", false))
        colorList.add(ItemModel("Leo", R.drawable.colorgreen, "", true))
        colorList.add(ItemModel("Luke", R.drawable.colororange, "", false))


    }

    private fun setAdapter() {
        sizeRecyclerView?.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, true)
            adapter = ItemAdapter(this@MainActivity, userList)
        }

        colorRecyclerView?.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, true)
            adapter = ItemAdapter(this@MainActivity, colorList)
        }
    }
}