package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Robot implements Origen {
    private String desc = "Los robots comienzan el combate con 100% de Maná. Se activa con un robot en tu tablero.";
    //Son robots: Blitzcrank.
    @Override
    public String getDesc() {
        return desc;
    }
}
