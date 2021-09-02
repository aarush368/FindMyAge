package com.kec.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
      var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btngetage.setOnClickListener {
            val userDOB:Int = Integer.parseInt(etDOB.text.toString())
            
            val currentYear: Int = cal.get(Calendar.YEAR)
            val userAgeInYear: Int = currentYear-userDOB
            tvShowAge.text = "Your Age is $userAgeInYear Years"
        }
    }

//    fun buUserAgeClick( view: View){
//        val userDOB:Int = Integer.parseInt(etDOB.text.toString())
//        val currentYear: Int = cal.get(Calendar.YEAR)
//        val userAgeInYear: Int = currentYear-userDOB
//        tvShowAge.text = "Your Age is $userAgeInYear Years"
//
//    }


}