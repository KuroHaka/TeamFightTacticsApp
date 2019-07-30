package com.GameCode.teamfighttacticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fuente
        String carpetaFuente = "fuente/TFTfont.otf";
        TextView txt1 = findViewById(R.id.txt1);
        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

        txt1.setTypeface(fuente);
    }
}
