package ru.progmatik.study02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandom()
    }

    fun showRandom(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()

        var randomInt = 0

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        textViewRandom.text = randomInt.toString()

        textRandomHeader.text = getString(R.string.textRandomHeader, count)
    }
}