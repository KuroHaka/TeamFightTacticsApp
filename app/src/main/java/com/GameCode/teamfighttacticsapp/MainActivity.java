package com.GameCode.teamfighttacticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

enum MenuMode{
    ITEM,CHAMP,NONE;
}
public class MainActivity extends AppCompatActivity {
    MenuMode menuMode = MenuMode.NONE;
    String carpetaFuente = "font/TFTfont.otf";
    TextView txtCampeones;
    TextView txtEstadisticas;
    TextView txtItems;
    TextView txtSelec;
    ImageButton butChamp;
    ImageButton butItem;
    ImageButton butChampSelec;
    ImageButton butItemSelec;
    ImageButton butSelec;
    Typeface fuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //font
        carpetaFuente = "font/TFTfont.otf";
        txtCampeones = findViewById(R.id.txtCampeones);
        txtEstadisticas = findViewById(R.id.txtEstadisticas);
        txtItems = findViewById(R.id.txtItems);
        txtSelec = findViewById(R.id.txtSelec);
        butChamp = findViewById(R.id.triangulo1);
        butItem = findViewById(R.id.triangulo2);
        butSelec = findViewById(R.id.selec);
        butChampSelec = findViewById(R.id.triangulo1b);
        butItemSelec = findViewById(R.id.triangulo2b);
        fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

        txtCampeones.setTypeface(fuente);
        txtEstadisticas.setTypeface(fuente);
        txtItems.setTypeface(fuente);
        txtSelec.setTypeface(fuente);
        butChampSelec.setVisibility(View.INVISIBLE);
        butItemSelec.setVisibility(View.INVISIBLE);

        butChamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnChampSelect();
            }
        });
        butItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnItemSelect();
            }
        });
        butSelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (menuMode==MenuMode.ITEM){
                    Intent intent = new Intent(view.getContext(),ItemActivity.class);
                    startActivityForResult(intent,0);
                }
            }
        });


    }

    void OnChampSelect(){
        menuMode=MenuMode.CHAMP;
        butItemSelec.setVisibility(View.INVISIBLE);
        butChampSelec.setVisibility(View.VISIBLE);
        txtCampeones.setTextColor(Color.parseColor("#9e6c36"));
        txtItems.setTextColor(Color.parseColor("#0c1a1e"));
    }

    void OnItemSelect(){
        menuMode=MenuMode.ITEM;
        butItemSelec.setVisibility(View.VISIBLE);
        butChampSelec.setVisibility(View.INVISIBLE);
        txtItems.setTextColor(Color.parseColor("#9e6c36"));
        txtCampeones.setTextColor(Color.parseColor("#0c1a1e"));
    }
}
