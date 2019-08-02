package com.GameCode.teamfighttacticsapp.Champs;

import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Clases.ContenedorClases;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.ContenedorOrigenes;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;

import java.util.ArrayList;

public class ChampContainer {
    private ArrayList<Champs> champList;

    public ArrayList<Champs> getChampList() {
        return champList;
    }

    public ChampContainer() {
        ContenedorClases clase = new ContenedorClases();
        ContenedorOrigenes origen = new ContenedorOrigenes();
        //RELLENAR DE CAMPEONES
        Champs aatrox = new Champs(0, "Aatrox", "La Espada Darkin", 0, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Espadachin()}); champList.add(aatrox);
        Champs ahri = new Champs(0, "Ahri", "Orbe del Engaño", 0, 2, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Hechicero()}); champList.add(ahri);
        Champs akali = new Champs(0, "Akali", "Ráfaga de los Cinco Filos", 0, 4, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(akali);
    }
}
