package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Salvaje implements Origen {
    private String desc = "Cada ataque de una unidad les da Furia (hasta 5 acumulaciones). La Furia otorga 8% de velocidad de ataque por cada acumulación. Se activa con 2 salvajes en tu tablero y con 4 salvajes todo el equipo obtiene Furia.";
    //Son salvajes: Ahri, Gnar, Nidalee, Rengar y Warwick.
    @Override
    public String getDesc() {
        return desc;
    }
}
