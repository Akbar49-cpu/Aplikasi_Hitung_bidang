package com.relative.aplikasihitungbidang

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_persegi.*

class PersegiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)
        btn_count.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_count) {

            var length = et_length.text.toString().trim()
            var width = et_width.text.toString().trim()

            //2 * Math.PI * r

            if (length.isEmpty()) {
                et_length.setError("Panjang tidak boleh kosong")
            } else if (width.isEmpty()) {
                et_width.setError("Lebar tidak boleh kosong")
            }
            else{
                var countLuas = length.toDouble() * width.toDouble()
                var countKeliling = 2 * (length.toDouble() + width.toDouble())

                tv_result_1.setText(countLuas.toString())
                tv_result_2.setText(countKeliling.toString())
            }
        }
    }
}