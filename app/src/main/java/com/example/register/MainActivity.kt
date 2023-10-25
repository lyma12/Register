package com.example.register

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout)

    }
    override fun onClick(v: View?){
        if(v?.id == R.id.Register){
            if(!checkInput()){
                val toast = Toast.makeText(this, "Điền thông tin đầy đủ!", Toast.LENGTH_SHORT)
                toast.show()
            }

        }
    }
    public fun checkInput(): Boolean{
        var text: EditText = findViewById(R.id.text_BD)
        if(text.text.equals("")) return false
        text = findViewById(R.id.text_FN)
        if(text.text.equals("")) return false
        text = findViewById(R.id.text_LN)
        if(text.text.equals("")) return false
        text = findViewById(R.id.text_Address)
        if(text.text.equals("")) return false
        text = findViewById(R.id.text_Email)
        if(text.text.equals("")) return false
        var radioM: RadioButton = findViewById(R.id.radio_male)
        var radioF: RadioButton = findViewById(R.id.radio_female)
        if(!radioM.isChecked && !radioF.isChecked) return false
        var checkRadio: RadioGroup = findViewById(R.id.radioGroup)
        if(!checkRadio.isClickable) return false
        return true
    }
}

