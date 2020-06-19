package com.relative.aplikasihitungbidang

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_menu_1.setOnClickListener(this)
        btn_menu_2.setOnClickListener(this)
        btn_menu_3.setOnClickListener(this)
        btn_menu_4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btn_menu_1 ->{
                startActivity(Intent(this@MainActivity, PersegiActivity::class.java))
            }
            R.id.btn_menu_2 ->{
                startActivity(Intent(this@MainActivity, LingkaranActivity::class.java))

            }
            R.id.btn_menu_3 ->{
                startActivity(Intent(this@MainActivity, PersegiPanjangActivity::class.java))
            }
            R.id.btn_menu_4 ->{
                startActivity(Intent(this@MainActivity, SegitigaActivity::class.java))
            }
        }
    }
}