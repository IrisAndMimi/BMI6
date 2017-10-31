package com.nanachi.bmi6;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        
      /*  EditText edWe = (EditText)findViewById(R.id.edW);
        EditText edHe = (EditText)findViewById(R.id.edH);*/
        float we = Float.parseFloat(edWe.getText().toString());
        float he = Float.parseFloat(edHe.getText().toString());
        float bmi = we/(he*he);
        new AlertDialog.Builder(this)
                .setMessage("Bmi is"+bmi)
                .setPositiveButton("OK",null)
                .show();
    }

   }
