package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Imperial implements Origen {
    private String desc = "Los imperiales infligen el doble de daño. Se activa con 2 imperiales en tu tablero (un Imperial realiza el doble de daño y todos los imperiales infligen el doble de daño con cuatro imperiales en el tablero).";
    //Son imperiales: Darius, Draven, Katarina y Swain.
    @Override
    public String getDesc() {
        return desc;
    }
}
