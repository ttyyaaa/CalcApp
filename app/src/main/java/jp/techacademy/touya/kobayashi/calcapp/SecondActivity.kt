package jp.techacademy.touya.kobayashi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0f)
        val value2 = intent.getFloatExtra("VALUE2", 0f)
        val value3 = intent.getStringExtra("VALUE3")

        when (value3) {
            "+" -> textView.text = "${value1 + value2}"
            "-" -> textView.text = "${value1 - value2}"
            "×" -> textView.text = "${value1 * value2}"
            "÷" -> textView.text = "${value1 / value2}"
        }

        Log.d("keisan", value1.toString())
        Log.d("keisan", value2.toString())
        Log.d("keisan", value3.toString())

    }
}