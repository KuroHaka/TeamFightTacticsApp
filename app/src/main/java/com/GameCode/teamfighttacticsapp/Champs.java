package com.GameCode.teamfighttacticsapp;

public class Champs {
    private String imagePath, name, ulti;
    private int buy, tier;
    private Origen origen; private Clase clase;

    public String getImagePath() {
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

    public Origen getOrigen() {
        return origen;
    }

    public Clase getClase() {
        return clase;
    }

    public void setImagePath(String imagePath) {
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

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
