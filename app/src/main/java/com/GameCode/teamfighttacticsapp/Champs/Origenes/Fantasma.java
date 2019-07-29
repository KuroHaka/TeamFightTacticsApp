package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Fantasma implements Origen {
    private String desc = "Maldice a un enemigo al comienzo de la batalla y comienza la partida con 100 puntos de vida. Se activa con dos fantasmas en tu tablero.";
    //Son fantasmas: Karthus, Kindred y Mordekaiser.
    @Override
    public String getDesc() {
        return desc;
    }
}
