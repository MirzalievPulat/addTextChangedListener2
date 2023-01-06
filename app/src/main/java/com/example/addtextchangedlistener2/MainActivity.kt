package com.example.addtextchangedlistener2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var editText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.EditText)

        editText.addTextChangedListener(textWatcher)

    }
    var textWatcher = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        @SuppressLint("SuspiciousIndentation")
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            textView.text = "Text is: $s"
                if (count == 14){
                    Toast.makeText(applicationContext, "Max limit reached", Toast.LENGTH_SHORT).show()
                }


        }

        override fun afterTextChanged(s: Editable?) {
        }

    }
}