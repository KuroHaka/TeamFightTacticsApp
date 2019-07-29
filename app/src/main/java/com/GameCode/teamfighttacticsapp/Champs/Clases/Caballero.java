package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Caballero implements Clase{
    private String desc = "Los caballeros bloquean daño de los ataques básicos. 20 puntos de daño bloqueado con 2 caballeros, 40 con 4 y 60 con 6. ";
    //on caballeros: Darius, Garen, Kayle, Mordekaiser, Poppy y Sejuani.
    @Override
    public String getDesc() {
        return desc;
    }
}
