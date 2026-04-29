package com.example.labubu_apps.pertemuan_7

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.labubu_apps.R
import com.example.labubu_apps.databinding.ActivitySevenBinding

class SevenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySevenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menggunakan ActivitySevenBinding sesuai dengan layout activity_seven.xml
        binding = ActivitySevenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Pertemuan 7"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            // Menggunakan icon back dari drawable
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        }
        // Menampilkan fragment pertama secara default
        replaceFragment(SatuFragment())

        // Setup event click untuk mengganti fragment
        binding.btFragment1.setOnClickListener {
            replaceFragment(SatuFragment())
        }

        binding.btnFragment2.setOnClickListener {
            replaceFragment(DuaFragment())
        }

        binding.btnFragment3.setOnClickListener {
            replaceFragment(TigaFragment())
        }
    }
//dsfgdsfgsd
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .addToBackStack(null)
            .commit()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // Tombol back untuk menutup activity dan kembali ke sebelumnya
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
