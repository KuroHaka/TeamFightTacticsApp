package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Demonio implements Origen {
    private String desc = "Pueden quemar todo el Maná del Campeón rival objetivo. Se activa con 2 demonios en tu tablero (30% de probabilidad, 50% con 4 y 70% con 6). ";
    //Son demonios: Aatrox, Brand, Elise, Evelynn, Morgana, Swain y Varus.
    @Override
    public String getDesc() {
        return desc;
    }
}
