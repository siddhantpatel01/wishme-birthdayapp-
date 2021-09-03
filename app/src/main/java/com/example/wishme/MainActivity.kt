package com.example.wishme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button2(view: View) {

        val name = nameInput.editableText.toString()

        val intent = Intent(this, MainActivity2::class.java)

        intent.putExtra(MainActivity2.NAME_EXTRA,name)

        startActivity(intent)

    }


}