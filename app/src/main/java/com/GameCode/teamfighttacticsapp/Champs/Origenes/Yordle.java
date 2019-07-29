package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class Yordle implements Origen{
    private String desc = "Los ataques contra tus Yordles tienen un 20# de chances de fallar. Se activa con 3 Yordles en tu tablero. Las probabilidades incrementan a un 50% con 6 Yordles en tu tablero.";
    //Son Yordles: Gnar, Kennen, Lulu, Poppy, Tristana y Veigar.
    @Override
    public String getDesc() {
        return desc;
    }
}
