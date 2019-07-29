package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public abstract class Origen {
    private enum origenes {
        DEMONIO, DRAGONES,
        EXILIADOS, GLACIALES,
        IMPERIALES, NOBLES,
        NINJAS, PIRATAS,
        FANTASMA, ROBOTS,
        VOID, WILDS,
        YORDLE
    }
    private String desc;

    public String getDesc() {
        return desc;
    }
}
