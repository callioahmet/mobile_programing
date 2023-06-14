package com.example.buldanyemektarifleri.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.buldanyemektarifleri.R

class MealDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarifler)

        val mealName = intent.getStringExtra("mealName")
        val mealImageResource = intent.getIntExtra("mealImageResource", 0)
        val mealRecipe = intent.getStringExtra("mealRecipe")
        val textView4 = intent.getStringExtra("textView4")
        val textView5 = intent.getStringExtra("textView5")

        val mealNameTextView = findViewById<TextView>(R.id.mealNameTextView)
        val mealRecipeTextView = findViewById<TextView>(R.id.mealRecipeTextView)
        val textView4TextView = findViewById<TextView>(R.id.textView4)
        val textView5TextView = findViewById<TextView>(R.id.textView5)
        val mealImageView = findViewById<ImageView>(R.id.mealImageView)
        val button = findViewById<Button>(R.id.button2)

        mealNameTextView.text = mealName
        mealRecipeTextView.text = mealRecipe
        textView4TextView.text = textView4
        textView5TextView.text = textView5
        mealImageView.setImageResource(mealImageResource)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
