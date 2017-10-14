package com.example.rohit.body_mass_index;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class First_Activity extends AppCompatActivity {

    EditText a1, a2,editText;
    ImageButton bn1,bn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        addListenerOnButtonClick();

    }


    public void addListenerOnButtonClick() {

        a1 = (EditText) findViewById(R.id.e1);
        a2 = (EditText) findViewById(R.id.e2);
        bn1=(ImageButton)findViewById(R.id.b1);
        bn2=(ImageButton)findViewById(R.id.b2);

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder result = new StringBuilder();
                String v1 = a1.getText().toString();
                String v2 = a2.getText().toString();

                float a = Float.parseFloat(v1);
                float b = Float.parseFloat(v2);


                float r = (b / (a * a));
                result.append("your BMI is" + "\n");
                result.append(r);

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1.getText().clear();
                a2.getText().clear();


            }
        });


    }




}

