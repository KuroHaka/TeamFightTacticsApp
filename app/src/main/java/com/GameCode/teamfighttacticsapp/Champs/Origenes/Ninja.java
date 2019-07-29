package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Ninja implements Origen {
    private String desc = "Si tienes exactamente un sólo Ninja, éste recibirá 40% de daño de ataque extra. Si tienes exactamente cuatro ninjas, todos ellos recibirán 60% de daño de ataque extra.";
    //Son ninjas: Akali, Kennen, Shen y Zed.
    @Override
    public String getDesc() {
        return desc;
    }
}
