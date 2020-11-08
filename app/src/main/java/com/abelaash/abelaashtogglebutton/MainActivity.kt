package com.abelaash.abelaashtogglebutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // process the togglebutton

        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                //if the toggle button is enabled
                Toast.makeText(this, "Toggle On", Toast.LENGTH_SHORT).show()
                root_layout.setBackgroundColor(Color.MAGENTA)
            } else{

                Toast.makeText(this, "Toggle Off", Toast.LENGTH_SHORT).show()
                root_layout.setBackgroundColor(Color.WHITE)
            }
        }
        // Process the switch button
        switch1.setOnCheckedChangeListener { compoundButton, onSwitch ->
            //The switch is enabled/checked
            if(onSwitch)
            //Change the button (Background color)
                switch1.setBackgroundColor(Color.GREEN)
            else
                switch1.setBackgroundColor(Color.WHITE
                )
        }
    }
}
