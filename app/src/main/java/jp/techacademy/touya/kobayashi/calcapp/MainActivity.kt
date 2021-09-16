package jp.techacademy.touya.kobayashi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: View = findViewById(android.R.id.content)

        button1.setOnClickListener {
            if (editText1.text.toString() == "" || editText2.text.toString() == "") {
                val snackbar = Snackbar.make(rootLayout , "数値を入力してください。", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toFloat())
                intent.putExtra("VALUE2", editText2.text.toString().toFloat())
                intent.putExtra("VALUE3", "+")
                startActivity(intent)
            }
        }

        button2.setOnClickListener {
            if (editText1.text.toString() == "" || editText2.text.toString() == "") {
                val snackbar = Snackbar.make(rootLayout , "数値を入力してください。", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toFloat())
                intent.putExtra("VALUE2", editText2.text.toString().toFloat())
                intent.putExtra("VALUE3", "-")
                startActivity(intent)
            }
        }

        button3.setOnClickListener {
            if (editText1.text.toString() == "" || editText2.text.toString() == "") {
                val snackbar = Snackbar.make(rootLayout , "数値を入力してください。", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toFloat())
                intent.putExtra("VALUE2", editText2.text.toString().toFloat())
                intent.putExtra("VALUE3", "×")
                startActivity(intent)
            }
        }

        button4.setOnClickListener {
            if (editText1.text.toString() == "" || editText2.text.toString() == "") {
                val snackbar = Snackbar.make(rootLayout , "数値を入力してください。", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toFloat())
                intent.putExtra("VALUE2", editText2.text.toString().toFloat())
                intent.putExtra("VALUE3", "÷")
                startActivity(intent)
            }
        }

    }

}