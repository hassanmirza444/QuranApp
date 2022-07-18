package com.example.demo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.R
import com.example.demo.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    lateinit var binding:ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnArabicQari.setOnClickListener {
            openSelectRecitorActivity("quran")
        }
        binding.btnTranslatedQari.setOnClickListener {
            openSelectRecitorActivity("translation")
        }
        binding.btnTafseerQari.setOnClickListener {
            openSelectRecitorActivity("tafsir")
        }
        binding.btnTransliterationQari.setOnClickListener {
            openSelectRecitorActivity("transliteration")
        }


    }

    private fun openSelectRecitorActivity(type:String){
        val intent:Intent = Intent(this@SettingsActivity,SelectRecitorActivity::class.java).apply {
            putExtra("type",type)
        }
        startActivity(intent)
    }
}