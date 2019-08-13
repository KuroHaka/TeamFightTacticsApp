package com.GameCode.teamfighttacticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Items_Activity extends AppCompatActivity {

    Button arco;
    Button capa;
    Button vara;
    Button cota;
    Button cinturon;
    Button espatula;
    Button espadon;
    Button lagrima;

    Button arcoE;
    Button capaE;
    Button varaE;
    Button cotaE;
    Button cinturonE;
    Button espatulaE;
    Button espadonE;
    Button lagrimaE;

    LinearLayout baseItemScroll;
    LinearLayout baseEraseItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_);

        arco = findViewById(R.id.arcorecurvo_base);
        capa = findViewById(R.id.capanegatron_base);
        vara = findViewById(R.id.varainnecesariamentegrande_base);
        cota = findViewById(R.id.cotademalla_base);
        cinturon = findViewById(R.id.cinturondelgigante_base);
        espatula = findViewById(R.id.espatula_base);
        espadon = findViewById(R.id.espadon_base);
        lagrima = findViewById(R.id.lagrimadeladiosa_base);

        arcoE = findViewById(R.id.arcorecurvo_base_erase);
        capaE = findViewById(R.id.capanegatron_base_erase);
        varaE = findViewById(R.id.varainnecesariamentegrande_base_erase);
        cotaE = findViewById(R.id.cotademalla_base_erase);
        cinturonE = findViewById(R.id.cinturondelgigante_base_erase);
        espatulaE = findViewById(R.id.espatula_base_erase);
        espadonE = findViewById(R.id.espadon_base_erase);
        lagrimaE = findViewById(R.id.lagrimadeladiosa_base_erase);

        baseItemScroll = findViewById(R.id.baseItemScroll);
        baseEraseItemView = findViewById(R.id.baseEraseItemView);


        setStartButton();

        arco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(arco);
                baseEraseItemView.addView(arcoE);
            }
        });
        capa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(capa);
                baseEraseItemView.addView(capaE);
            }
        });
        vara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(vara);
                baseEraseItemView.addView(varaE);
            }
        });
        cota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(cota);
                baseEraseItemView.addView(cotaE);
            }
        });
        cinturon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(cinturon);
                baseEraseItemView.addView(cinturonE);
            }
        });
        espatula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(espatula);
                baseEraseItemView.addView(espatulaE);
            }
        });
        espadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(espadon);
                baseEraseItemView.addView(espadonE);
            }
        });
        lagrima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseItemScroll.removeView(lagrima);
                baseEraseItemView.addView(lagrimaE);
            }
        });
        // erasers
        arcoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(arcoE);
                baseItemScroll.addView(arco);
            }
        });
        capaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(capaE);
                baseItemScroll.addView(capa);
            }
        });
        varaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(varaE);
                baseItemScroll.addView(vara);
            }
        });
        cotaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(cotaE);
                baseItemScroll.addView(cota);
            }
        });
        cinturonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(cinturonE);
                baseItemScroll.addView(cinturon);
            }
        });
        espatulaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(espatulaE);
                baseItemScroll.addView(espatula);
            }
        });
        espadonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(espadonE);
                baseItemScroll.addView(espadon);
            }
        });
        lagrimaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baseEraseItemView.removeView(lagrimaE);
                baseItemScroll.addView(lagrima);
            }
        });
    }

    private void setStartButton(){
        baseEraseItemView.removeAllViews();
    }
}
