package com.example.mathsallconversions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KmtoMeter extends AppCompatActivity {

    /*
    1 kilometer = 1000 meter
     */
    private Button b1;
    private EditText e1;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmto_meter);
        b1=(Button)findViewById(R.id.converttoinch);
        e1=(EditText)findViewById(R.id.input);
        t1=(TextView)findViewById(R.id.finaloutput);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  multiplier=1000;
                int result=0;
                if(e1.getText().toString().equals("")){
                    t1.setText(R.string.error_message);
                    t1.setTextColor(Color.RED);
                }
                else {


                    int Metervalue = Integer.parseInt(e1.getText().toString());
                    result = Metervalue * multiplier;
                    t1.setText(result +" " + "meter");
                    t1.setTextColor(Color.BLUE);

                }

            }
        });

    }


}
