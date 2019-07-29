package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Noble implements Origen {
    private String desc = "100 de armadura a un aliado y 35 puntos de curación al golpear. Recibe la bonificación un aliado aleatorio con 3 nobles en tu tablero y la reciben todos con seis nobles en el tablero.";
    //Son nobles: Fiora, Garen, Kayle, Leona, Lucian y Vayne.
    @Override
    public String getDesc() {
        return desc;
    }
}
