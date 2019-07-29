package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Espadachin implements Clase{
    private String desc = "Los espadachines obtienen un 35% de chances de realizar un ataque consecutivo. Se activa con 3 espadachines en tu tablero. Al juntar 6 espadachines se pueden realizar hasta dos ataques extras.";
    //Son espadachines: Aatrox, Draven, Fiora, Gangplank, Shen y Yasuo.
    @Override
    public String getDesc() {
        return desc;
    }
}
