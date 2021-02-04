package com.example.coroutinesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.HttpException

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text)


        ApiRequests().getPosts(object : Result<List<Post>?> {
            override fun onSuccess(t: List<Post>?) {
                text.text = t?.get(0)?.title ?: "null"
                Toast.makeText(
                    applicationContext,
                    "The request has been executed",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onFailure(message: String) {
                text.text = message
            }

            override fun onException(e: HttpException) {
                text.text = e.message()
            }
        })

    }
}