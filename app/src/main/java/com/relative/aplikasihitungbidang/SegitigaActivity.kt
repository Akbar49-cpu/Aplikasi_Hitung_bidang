package com.relative.aplikasihitungbidang

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_persegi_panjang.*
import kotlinx.android.synthetic.main.activity_segitiga.*

class SegitigaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
        btn_count3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == R.id.btn_count3) {

                var alas = et_alas.text.toString().trim()
                var tinggi = et_tinggi.text.toString().trim()

                if (alas.isEmpty()) {
                    et_length.setError("Alas tidak boleh kosong")
                } else if (tinggi.isEmpty()) {
                    et_width.setError("Tinggi tidak boleh kosong")
                } else {

                    var countLuas = alas.toDouble() * tinggi.toDouble() / 2

                    tv_result_7.setText(countLuas.toString())
                }
            }
        }
    }
}
