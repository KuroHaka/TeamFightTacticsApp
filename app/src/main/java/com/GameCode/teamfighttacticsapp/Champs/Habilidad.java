package com.GameCode.teamfighttacticsapp.Champs;

public class Habilidad {
    private String name, description;
    private int imagePath;

    /*
    Constructor
     */
    Habilidad(String name, String description, int imagePath) {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }

    /*
    Getters
     */
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImagePath() {
        return imagePath;
    }
}
