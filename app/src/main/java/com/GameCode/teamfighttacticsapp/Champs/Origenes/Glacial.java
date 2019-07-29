package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Glacial implements Origen {
    private String desc = "Pueden aturdir al enemigo al impactarlos. Se activa con 2 glaciales en tu tablero (25% de probabilidad, 35% con 4 y 45% con 6).";
    //Son glaciales: Anivia, Ashe, Braun, Lissandra, Sejuani y Volibear.
    @Override
    public String getDesc() {
        return desc;
    }
}
