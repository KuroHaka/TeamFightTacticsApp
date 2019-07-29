package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Dragon implements Origen{
    private String desc = "Los dragones son inmunes al daño mágico. Se activa con 2 dragones en tu campo.";
    //Son dragones: Aurelion Sol y Shyvana.
    @Override
    public String getDesc() {
        return desc;
    }
}
