package com.example.calcreloaded

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.calcreloaded.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var display: EditText
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        display = findViewById(R.id.textView)


        binding.textView.setOnClickListener {
            display
        }
        binding.oneBTN.setOnClickListener {
            oneBTN("1")
        }
        binding.twoBTN.setOnClickListener {
            oneBTN("2")
        }
        binding.threeBTN.setOnClickListener {
            oneBTN("3")
        }
        binding.fourBTN.setOnClickListener {
            oneBTN("4")
        }
        binding.fiveBTN.setOnClickListener {
            oneBTN("5")
        }
        binding.sixBTN.setOnClickListener {
            oneBTN("6")
        }
        binding.sevenBTN.setOnClickListener {
            oneBTN("7")
        }
        binding.eightBTN.setOnClickListener {
            oneBTN("8")
        }
        binding.nineBTN.setOnClickListener {
            oneBTN("9")
        }
        binding.plusMinusBTN.setOnClickListener {
            oneBTN("+/-")
        }
        binding.clearBTN.setOnClickListener {
            //ClearBTN()
        }
        binding.divideBTN.setOnClickListener {
            //divideBTN()
        }
        binding.equalsBTN.setOnClickListener {
            oneBTN("=")
        }
        binding.exponentBTN.setOnClickListener {
            oneBTN("^")
        }
        binding.parenthesesBTN.setOnClickListener {
            oneBTN("()")
        }
        binding.multiplyBTN.setOnClickListener {
            oneBTN("*")
        }
        binding.pointBTN.setOnClickListener {
            oneBTN(".")
        }
        binding.subtractBTN.setOnClickListener {
            oneBTN("-")
        }
        binding.plusBTN.setOnClickListener {
            oneBTN("+")
        }
        binding.backspace.setOnClickListener {
            //backspace()
        }
    }

    private fun oneBTN(text : String) {
        binding.textView.append(text)
    }
}

