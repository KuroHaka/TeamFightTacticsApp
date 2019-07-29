package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Exiliado implements Origen {
    private String desc = "omienza el combate con un escudo idéntico al 100% de sus puntos de vida máximos si no tiene aliados en parcelas adyacentes.";
    //Son exiliados: Yasuo.
    @Override
    public String getDesc() {
        return desc;
    }

}
