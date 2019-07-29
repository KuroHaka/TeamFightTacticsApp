package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Cambiaformas implements Clase{
    private String desc = " Ganan 100% de vida máxima al transformarse. Se activa con 3 cambiaformas en el tablero.";
    //Son cambiaformas: Elise, Gnar, Nidalee, Shyvana y Swain.
    @Override
    public String getDesc() {
        return desc;
    }
}

