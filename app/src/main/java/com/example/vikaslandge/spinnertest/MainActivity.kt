package com.example.vikaslandge.spinnertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import com.example.vikaslandge.spinnertest.R.string.Gender
import android.widget.RadioButton
import android.widget.RadioGroup



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity,"Nothing selected",Toast.LENGTH_LONG)
            }

                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    if (p2 >0) {

                        Toast.makeText(this@MainActivity, sp1.selectedItem.toString(), Toast.LENGTH_LONG).show()
                    }
                }

        }

        val radioGroup = findViewById<RadioGroup>(R.id.rdg1)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            var text = "You selected: "
            text += if (checkedId==1) (
                    findViewById<RadioButton>(checkedId)).text.toString()
                else(findViewById<RadioButton>(checkedId)).text.toString()

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }



    }
}
