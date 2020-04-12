package com.example.mathsallconversions;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MeterToInch extends AppCompatActivity {
   private Button b1;
   private EditText e1;
   private TextView t1,t2,t3,t4;
   private Button i,f,y,centi;


   /*
   1m=39.37inche;
   1m=100 centimeter;
   1m=1.093 yard;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_inch);
        b1=(Button)findViewById(R.id.converttoinch);
        e1=(EditText)findViewById(R.id.input);
        i=(Button)findViewById(R.id.inchbutton);
        f=(Button)findViewById(R.id.feetbutton);
        y=(Button)findViewById(R.id.yardbutton);
        centi=(Button)findViewById(R.id.centibutton);


        t1=(TextView)findViewById(R.id.finaloutput);
        t2=(TextView)findViewById(R.id.finaloutput2);
        t3=(TextView)findViewById(R.id.finaloutput3);
        t4=(TextView)findViewById(R.id.finaloutput5);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplierforinche=39.37;
                double resultforinch=0.0;
                if(e1.getText().toString().equals("")){
                    AlertDialog alertDialog = new AlertDialog.Builder(MeterToInch.this).create();
                    alertDialog.setTitle("Alert Dialog");

                    alertDialog.setMessage("Please enter valid number");
                    alertDialog.setIcon(R.drawable.ic_warning_black_24dp);

                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                        }
                    });

                    alertDialog.show();
                }
                else {
                    double Metervalue = Double.parseDouble(e1.getText().toString());
                    resultforinch = Metervalue * multiplierforinche;
                    t1.setText(String.format("%.2f",resultforinch) +" " + "inch");
                    t1.setTextColor(Color.BLUE);

                }

            }
        });
        centi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int multiplierforcenti=100;
                int resultforcentimeter=0;
                if(e1.getText().toString().equals("")){
                    AlertDialog alertDialog = new AlertDialog.Builder(MeterToInch.this).create();
                    alertDialog.setTitle("Alert Dialog");

                    alertDialog.setMessage("Please enter valid number");
                    alertDialog.setIcon(R.drawable.ic_warning_black_24dp);

                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                        }
                    });

                    alertDialog.show();
                }
                else {
                     double Metervalue2 = Integer.parseInt(e1.getText().toString());
                    resultforcentimeter = (int) (Metervalue2 * multiplierforcenti);
                    t2.setText(resultforcentimeter+" "+"centimeter");
                    t2.setTextColor(Color.BLUE);


                }

            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float multiplierforfeet=3.28f;
                float resultforfeet=0f;
                if(e1.getText().toString().equals("")){
                    AlertDialog alertDialog = new AlertDialog.Builder(MeterToInch.this).create();
                    alertDialog.setTitle("Alert Dialog");

                    alertDialog.setMessage("Please enter valid number");
                    alertDialog.setIcon(R.drawable.ic_warning_black_24dp);

                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                        }
                    });

                    alertDialog.show();
                }
                else
                {
                    float Metervalue3 = Float.parseFloat(e1.getText().toString());
                    resultforfeet = (float) (Metervalue3 * multiplierforfeet);
                    t3.setText((float)resultforfeet+" "+"feet");
                    t3.setTextColor(Color.BLUE);


                }
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float multiplierforyard=1.093f;
                float resultforyard=0f;
                if(e1.getText().toString().equals("")){
                    AlertDialog alertDialog = new AlertDialog.Builder(MeterToInch.this).create();
                    alertDialog.setTitle("Alert Dialog");

                    alertDialog.setMessage("Please enter valid number");
                    alertDialog.setIcon(R.drawable.ic_warning_black_24dp);

                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                        }
                    });

                    alertDialog.show();
                }
                else {

                    float Metervalue4 = Float.parseFloat(e1.getText().toString());
                    resultforyard = (float) (Metervalue4 * multiplierforyard);
                    t4.setText((float)resultforyard+" "+"yard");
                    t4.setTextColor(Color.BLUE);





                }

            }
        });

    }
}
