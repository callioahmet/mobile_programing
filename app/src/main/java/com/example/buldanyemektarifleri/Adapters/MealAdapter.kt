package com.example.buldanyemektarifleri.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.buldanyemektarifleri.Activity.MealDetail
import com.example.buldanyemektarifleri.Model.Meal
import com.example.buldanyemektarifleri.R

class MealAdapter(private val mealList: List<Meal>): RecyclerView.Adapter<MealAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.meal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meal = mealList[position]
        holder.mealNameTextView.text = meal.name
        holder.mealImageView.setImageResource(meal.imageResource)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, MealDetail::class.java).apply {
                putExtra("mealName", meal.name)
                putExtra("mealImageResource", meal.imageResource)
                putExtra("mealRecipe", meal.recipe)
                putExtra("textView4", meal.textView4)
                putExtra("textView5", meal.textView5)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mealList.size
    }
//alt kısım mainactivity için
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mealNameTextView: TextView = itemView.findViewById(R.id.mealNameTextView)
        val mealImageView: ImageView = itemView.findViewById(R.id.mealImageView)
    }
}
