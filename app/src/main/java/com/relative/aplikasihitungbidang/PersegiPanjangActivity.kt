package com.relative.aplikasihitungbidang

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_persegi_panjang.*

class PersegiPanjangActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        btn_count2.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        if (v.id == R.id.btn_count2) {

            var length = et_length.text.toString().trim()
            var width = et_width.text.toString().trim()

            if (length.isEmpty()) {
                et_length.setError("Panjang tidak boleh kosong")
            } else if (width.isEmpty()) {
                et_width.setError("Lebar tidak boleh kosong")
            } else {
                var countLuas = length.toDouble() * width.toDouble()
                var countKeliling = 2 * (length.toDouble() + width.toDouble())

                tv_result_5.setText(countLuas.toString())
                tv_result_6.setText(countKeliling.toString())
            }
        }
    }
}