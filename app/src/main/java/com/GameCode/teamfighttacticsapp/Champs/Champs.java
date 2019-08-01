package com.GameCode.teamfighttacticsapp.Champs;

import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;

public class Champs {
    private String name, ulti;
    private int buy, tier, imagePath;
    private Origen[] origen; private Clase[] clase;


    /*
    Constructor
     */
    public Champs(int imagePath, String name, String ulti, int buy, int tier, Origen[] origen, Clase[] clase) {
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

    public String getUlti() {
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


    /*
    Setters
     */
    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUlti(String ulti) {
        this.ulti = ulti;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }


}
