package com.GameCode.teamfighttacticsapp.Champs;

import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Clases.ContenedorClases;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.ContenedorOrigenes;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;


import java.util.ArrayList;
import java.util.Iterator;

public class ChampContainer {
    private ArrayList<Champs> champList;

    public ArrayList<Champs> getChampList() {
        return champList;
    }
    /*
    Para obtener los campeones por clase u origen lo mejor es que se obtenga la clase o el origen
    del campeón y se comparen las descripciones de dichas clases u origenes.
     */
    public ChampContainer() {
        ContenedorClases clase = new ContenedorClases();
        ContenedorOrigenes origen = new ContenedorOrigenes();
        //RELLENAR DE CAMPEONES
        Champs aatrox = new Champs(0, "Aatrox", "La Espada Darkin", 0, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Espadachin()}); champList.add(aatrox);
        Champs ahri = new Champs(0, "Ahri", "Orbe del Engaño", 0, 2, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Hechicero()}); champList.add(ahri);
        Champs akali = new Champs(0, "Akali", "Ráfaga de los Cinco Filos", 0, 4, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(akali);
        Champs anivia = new Champs(0, "Anivia", "Tormenta Glacial", 0, 5, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(anivia);
        Champs ashe = new Champs (0, "Ashe", "Flecha de Cristal Encantada", 0, 3, new Origen[]{origen.Glacial()}, new Clase[]{clase.Ranger()}); champList.add(ashe);
        Champs aurelion = new Champs(0, "Aurelion Sol", "Voz de Luz", 0, 4, new Origen[]{origen.Dragon()}, new Clase[]{clase.Hechicero()}); champList.add(aurelion);
        Champs blitzcrank = new Champs(0, "Blitzcrank", "Agarre Cohete", 0, 2, new Origen[]{origen.Robot()}, new Clase[]{clase.Luchador()}); champList.add(blitzcrank);
        Champs brand = new Champs(0, "Brand", "Piroclasma", 0, 4, new Origen[]{origen.Demonio()}, new Clase[]{clase.Elementalista()}); champList.add(brand);
        Champs braum = new Champs(0, "Braum", "Inquebrantable", 0, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Guardian()}); champList.add(braum);
        Champs cho = new Champs(0, "Cho'Gath", "Ruptura", 0, 4, new Origen[]{origen.Vacio()}, new Clase[]{clase.Luchador()}); champList.add(cho);
        Champs darius = new Champs(0, "Darius", "Diezmar", 0, 1, new Origen[]{origen.Imperial()}, new Clase[]{clase.Caballero()}); champList.add(darius);
        Champs draven = new Champs(0, "Draven", "Hachas Giratorias", 0, 4, new Origen[]{origen.Imperial()}, new Clase[]{clase.Espadachin()}); champList.add(draven);
        Champs elise = new Champs(0, "Elise", "Forma Arácnida", 0, 2, new Origen[]{origen.Demonio()}, new Clase[]{clase.Cambiaformas()}); champList.add(elise);
        Champs evelynn = new Champs(0, "Evelynn", "Última Cariciaa", 0, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Asesino()}); champList.add(evelynn);
        Champs fiora = new Champs(0, "Fiora", "Estocada", 0, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Espadachin()}); champList.add(fiora);
        Champs gangplank = new Champs(0, "Gangplak", "Barriles de Pólvora", 0, 3, new Origen[]{origen.Pirata()}, new Clase[]{clase.Espadachin(), clase.Pistolero()}); champList.add(gangplank);
        Champs garen = new Champs(0, "Garen", "Juicio", 0, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(garen);
        Champs gnar = new Champs(0, "Gnar", "¡GNAR!", 0, 4, new Origen[]{origen.Salvaje(), origen.Yordle()}, new Clase[]{clase.Cambiaformas()}); champList.add(gnar);
        Champs graves = new Champs(0, "Graves","Plomazo", 0, 1, new Origen[]{origen.Pirata()}, new Clase[]{clase.Pistolero()}); champList.add(graves);
        Champs khartus = new Champs(0, "Khartus", "Réquiem", 0, 5, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Hechicero()}); champList.add(khartus);
        Champs kassadin = new Champs (0, "Kassadin", "Chuchilla Infernal", 0, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Hechicero()}); champList.add(kassadin);
        Champs katarina = new Champs(0, "Katarina", "Loto Mortal", 0, 3, new Origen[]{origen.Imperial()}, new Clase[]{clase.Asesino()}); champList.add(katarina);
        Champs kayle = new Champs (0, "Kayle", "Juicio Divino", 0,5, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(kayle);
        Champs kennen = new Champs(0, "Kennen", "Tempestad Cercenante", 0, 3, new Origen[]{origen.Ninja(), origen.Yordle()}, new Clase[]{clase.Elementalista()}); champList.add(kennen);
        Champs kha = new Champs(0, "Kha'Zix", "Saborea su Miedo", 0, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Asesino()}); champList.add(kha);
        Champs kindred = new Champs(0, "Kindred", "Alivio de Cordero", 0, 4, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Ranger()}); champList.add(kindred);
        Champs leona = new Champs(0, "Leona", "Llamarada Solar", 0, 4, new Origen[]{origen.Noble()}, new Clase[]{clase.Guardian()}); champList.add(leona);
        Champs lissandra = new Champs (0, "Lissandra", "Tumba congelada", 0, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(lissandra);

    }

    public ArrayList<Champs> getByName(String searching){
        ArrayList<Champs> searched = new ArrayList<>();
        Iterator<Champs> iter = champList.iterator();
        while(iter.hasNext()){
            //INTRODUCIR AQUÍ TIPO DE BÚSQUEDA
            if (iter.next().getName().contains(searching)){
                searched.add(iter.next());
            }
        }
        return searched;
    }

    public ArrayList<Champs> getByClase(Clase searching){
        ArrayList<Champs> searched = new ArrayList<>();
        Iterator<Champs> iter = champList.iterator();
        while(iter.hasNext()){

            Clase[] probando = iter.next().getClase();
            for(int i = 0; i < 2; i++){
                if (searching.equals(probando[i])){
                    searched.add(iter.next());
                }
            }

        } return searched;
    }

    public ArrayList<Champs> getByOrigen(Origen searching){
        ArrayList<Champs> searched = new ArrayList<>();
        Iterator<Champs> iter = champList.iterator();
        while(iter.hasNext()){

            Origen[] probando = iter.next().getOrigen();
            for(int i = 0; i < 2; i++){
                if (searching.equals(probando[i])){
                    searched.add(iter.next());
                }
            }

        } return searched;
    }
}
