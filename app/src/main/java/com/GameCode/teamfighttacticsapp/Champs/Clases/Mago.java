package com.GameCode.teamfighttacticsapp.Champs.Clases;

public class Mago implements Clase{
    private String desc = "Los magos le otorgan a todo el equipo Poder de Habilidad extra. 35 puntos de Poder de Habiidad con 3 magos en el equipo y 100 puntos con 6. ";
    //Son magos: Ahri, Aurelion Sol, Kassadin, Khartus, Lulu, Morgana y Veigar.
    @Override
    public String getDesc() {
        return desc;
    }
}
