package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Vacio implements Origen {
    private String desc = "Los ataques de tu equipo ignoran el 50% de la armadura de tus enemigos. Se actica con 3 vacíos en tu tablero.";
    //Son vacíos: Cho'Gath Kassadin, Kha'Zix, y Rek'Sai
    @Override
    public String getDesc() {
        return desc;
    }
}
