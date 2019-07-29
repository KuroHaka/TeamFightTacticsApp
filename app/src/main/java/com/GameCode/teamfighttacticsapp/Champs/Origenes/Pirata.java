package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Pirata implements Origen {
    private String desc = "Obtienes hasta 4 de oro extra en cada ronda de jugador contra jugador. Se activa con 3 piratas en tu tablero.";
    //Son piratas: Gangplank, Graves, Miss Fortune y Pyke.
    @Override
    public String getDesc() {
        return desc;
    }
}
