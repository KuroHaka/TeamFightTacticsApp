package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Ranger implements Clase{
    private String desc = "Cada tres segundos, los rangers tienen la posibilidad de duplicar su velocidad de ataque por 3 segundos. 25% de probabilidades con 2 rangers y 65% con 4.";
    //Son rangers: Ashe, Kindred, Varus y Vayne.
    @Override
    public String getDesc() {
        return desc;
    }
}
