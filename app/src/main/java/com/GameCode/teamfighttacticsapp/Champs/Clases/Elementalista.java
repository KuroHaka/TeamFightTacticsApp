package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Elementalista implements Clase{
    private String desc = "En cada combate, invocan un monstruo elemental. Se activa con 3 elementalistas en el tablero.";
    //Son elementalistas: Anivia, Brand, Kennen y Lissandra.
    @Override
    public String getDesc() {
        return desc;
    }
}
