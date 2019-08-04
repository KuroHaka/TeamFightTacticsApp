package com.GameCode.teamfighttacticsapp.Champs;

import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;

public class Champs {
    private String name;
    private Habilidad ulti;
    private int buy, tier, imagePath;
    private Origen[] origen; private Clase[] clase;


    /*
    Constructor
     */
    public Champs(int imagePath, String name, Habilidad ulti, int buy, int tier, Origen[] origen, Clase[] clase) {
        this.imagePath = imagePath;
        this.name = name;
        this.ulti = ulti;
        this.buy = buy;
        this.tier = tier;
        this.origen = origen;
        this.clase = clase;
    }


    /*
    Getters
     */
    public int getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }

    public Habilidad getUlti() {
        return ulti;
    }

    public int getBuy() {
        return buy;
    }

    public int getTier() {
        return tier;
    }

    public Origen[] getOrigen() {
        return origen;
    }

    public Clase[] getClase() {
        return clase;
    }
}
