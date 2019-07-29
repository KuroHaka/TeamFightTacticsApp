package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Pistolero implements Clase{
    private String desc = "Los pistoleros obtienen un 50% de probabilidades de atacar a un enemigo adicional. Esta habilidad se activa con 2 pistoleros en tu tablero y se incrementa a todos los enemigos dentro del rango si hay 4 pistoleros juntos. ";
    //Son pistoleros: Gangplank, Graves, Lucian, Miss Fortune y Tristana.
    @Override
    public String getDesc() {
        return desc;
    }
}
