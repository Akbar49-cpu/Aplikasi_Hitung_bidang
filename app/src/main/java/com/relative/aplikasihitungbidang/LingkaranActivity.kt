package com.relative.aplikasihitungbidang

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lingkaran.*

class LingkaranActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        btn_count1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_count1) {

            var radius = et_radius.text.toString().trim()

            if (radius.isEmpty()) {
                et_radius.setError("Jari-jari tidak boleh kosong")
            } else {
                var countLuas = Math.PI * radius.toDouble() * radius.toDouble()
                var countKeliling = 2 * Math.PI * radius.toDouble()



                tv_result_3.setText(countLuas.toString())
                tv_result_4.setText(countKeliling.toString())
            }
        }
    }
}