package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Asesino implements Clase {
    private String desc = "Los asesinos ganan 150% de daño crítico. Se activa con 3 asesinos en tu tablero. Si hay 6 asesinos se incrementa al 300%.";
    //Son asesinos: Akali, Evelynn, Katarina, Kha'Zix, Rengar, Pyke y Zed.
    @Override
    public String getDesc() {
        return desc;
    }
}
