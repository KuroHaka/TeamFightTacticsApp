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
        HabilidadContainer Habilidad = new HabilidadContainer();
        //RELLENAR DE CAMPEONES
        Champs aatrox = new Champs(0, "Aatrox", Habilidad.aatrox(), 0, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Espadachin()}); champList.add(aatrox);
        Champs ahri =   new Champs(0, "Ahri", Habilidad.ahri(), 0, 2, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Hechicero()}); champList.add(ahri);
        Champs akali =  new Champs(0, "Akali", Habilidad.akali(), 0, 4, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(akali);
        Champs anivia = new Champs(0, "Anivia", Habilidad.anivia(), 0, 5, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(anivia);
        Champs ashe =   new Champs (0, "Ashe", Habilidad.ashe(), 0, 3, new Origen[]{origen.Glacial()}, new Clase[]{clase.Ranger()}); champList.add(ashe);

        Champs aurelion = new Champs(0, "Aurelion Sol", Habilidad.aurelion(), 0, 4, new Origen[]{origen.Dragon()}, new Clase[]{clase.Hechicero()}); champList.add(aurelion);
        Champs blitzcrank = new Champs(0, "Blitzcrank", Habilidad.blitzcrank(), 0, 2, new Origen[]{origen.Robot()}, new Clase[]{clase.Luchador()}); champList.add(blitzcrank);
        Champs brand = new Champs(0, "Brand", Habilidad.brand(), 0, 4, new Origen[]{origen.Demonio()}, new Clase[]{clase.Elementalista()}); champList.add(brand);
        Champs braum = new Champs(0, "Braum", Habilidad.braum(), 0, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Guardian()}); champList.add(braum);
        Champs cho = new Champs(0, "Cho'Gath", Habilidad.cho(), 0, 4, new Origen[]{origen.Vacio()}, new Clase[]{clase.Luchador()}); champList.add(cho);

        Champs darius = new Champs(0, "Darius", Habilidad.darius(), 0, 1, new Origen[]{origen.Imperial()}, new Clase[]{clase.Caballero()}); champList.add(darius);
        Champs draven = new Champs(0, "Draven", Habilidad.draven(), 0, 4, new Origen[]{origen.Imperial()}, new Clase[]{clase.Espadachin()}); champList.add(draven);
        Champs elise = new Champs(0, "Elise", Habilidad.elise(), 0, 2, new Origen[]{origen.Demonio()}, new Clase[]{clase.Cambiaformas()}); champList.add(elise);
        Champs evelynn = new Champs(0, "Evelynn", Habilidad.evelynn(), 0, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Asesino()}); champList.add(evelynn);
        Champs fiora = new Champs(0, "Fiora", Habilidad.fiora(), 0, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Espadachin()}); champList.add(fiora);

        Champs gangplank = new Champs(0, "Gangplak", Habilidad.gangplank(), 0, 3, new Origen[]{origen.Pirata()}, new Clase[]{clase.Espadachin(), clase.Pistolero()}); champList.add(gangplank);
        Champs garen = new Champs(0, "Garen", Habilidad.garen(), 0, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(garen);
        Champs gnar = new Champs(0, "Gnar", Habilidad.gnar(), 0, 4, new Origen[]{origen.Salvaje(), origen.Yordle()}, new Clase[]{clase.Cambiaformas()}); champList.add(gnar);
        Champs graves = new Champs(0, "Graves",Habilidad.graves(), 0, 1, new Origen[]{origen.Pirata()}, new Clase[]{clase.Pistolero()}); champList.add(graves);
        Champs khartus = new Champs(0, "Khartus", Habilidad.khartus(), 0, 5, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Hechicero()}); champList.add(khartus);

        Champs kassadin = new Champs (0, "Kassadin", Habilidad.kassadin(), 0, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Hechicero()}); champList.add(kassadin);
        Champs katarina = new Champs(0, "Katarina", Habilidad.katarina(), 0, 3, new Origen[]{origen.Imperial()}, new Clase[]{clase.Asesino()}); champList.add(katarina);
        Champs kayle = new Champs (0, "Kayle", Habilidad.kayle(), 0,5, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(kayle);
        Champs kennen = new Champs(0, "Kennen", Habilidad.kennen(), 0, 3, new Origen[]{origen.Ninja(), origen.Yordle()}, new Clase[]{clase.Elementalista()}); champList.add(kennen);
        Champs kha = new Champs(0, "Kha'Zix", Habilidad.kha(), 0, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Asesino()}); champList.add(kha);

        Champs kindred = new Champs(0, "Kindred", Habilidad.kindred(), 0, 4, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Ranger()}); champList.add(kindred);
        Champs leona = new Champs(0, "Leona", Habilidad.leona(), 0, 4, new Origen[]{origen.Noble()}, new Clase[]{clase.Guardian()}); champList.add(leona);
        Champs lissandra = new Champs(0, "Lissandra", Habilidad.lissandra(), 0, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(lissandra);
        Champs lucian = new Champs(0, "Lucian", Habilidad.lucian(), 0, 2, new Origen[]{origen.Noble()}, new Clase[]{clase.Pistolero()}); champList.add(lucian);
        Champs lulu = new Champs(0, "Lulu", Habilidad.lulu(), 0, 2, new Origen[]{origen.Yordle()}, new Clase[]{clase.Hechicero()}); champList.add(lulu);

        Champs miss = new Champs(0, "Miss Fortune", Habilidad.miss(), 0, 5, new Origen[]{origen.Pirata()}, new Clase[]{clase.Pistolero()}); champList.add(miss);
        Champs mordekaiser = new Champs(0, "Mordekaiser", Habilidad.mordeakiser(), 0, 1, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Caballero()}); champList.add(mordekaiser);
        Champs morgana = new Champs(0, "Morgana", Habilidad.morgana(), 0, 3, new Origen[]{origen.Demonio()}, new Clase[] {clase.Hechicero()}); champList.add(morgana);
        Champs nidaleee = new Champs(0, "Nidaleee", Habilidad.nidalee(), 0, 1, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Cambiaformas()}); champList.add(nidaleee);
        Champs poppy = new Champs(0, "Poppy", Habilidad.poppy(), 0, 3, new Origen[]{origen.Yordle()}, new Clase[]{clase.Caballero()}); champList.add(poppy);

        Champs pyke = new Champs(0, "Pyke", Habilidad.pyke(), 0, 2, new Origen[]{origen.Pirata()}, new Clase[]{clase.Asesino()}); champList.add(pyke);
        Champs rek = new Champs(0, "Rek'Sai", Habilidad.rek(), 0, 2, new Origen[]{origen.Vacio()}, new Clase[]{clase.Luchador()}); champList.add(rek);
        Champs rengar = new Champs(0, "Rengar", Habilidad.rengar(), 0, 3, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Asesino()}); champList.add(rengar);
        Champs sejuani = new Champs(0, "Sejuani", Habilidad.sejuani(), 0, 4, new Origen[]{origen.Glacial()}, new Clase[]{clase.Caballero()}); champList.add(sejuani);
        Champs shen = new Champs(0, "Shen", Habilidad.shen(), 0, 2, new Origen[]{origen.Ninja()}, new Clase[]{clase.Espadachin()}); champList.add(shen);

        Champs shyvana = new Champs(0, "Shyvana", Habilidad.shyvana(), 0, 3, new Origen[]{origen.Dragon()}, new Clase[]{clase.Cambiaformas()}); champList.add(shyvana);
        Champs swain = new Champs(0, "Swain", Habilidad.swain(), 0, 5, new Origen[]{origen.Demonio(), origen.Imperial()}, new Clase[]{clase.Cambiaformas()}); champList.add(swain);
        Champs tristana = new Champs(0, "Tristana", Habilidad.tristana(), 0, 1, new Origen[]{origen.Yordle()}, new Clase[]{clase.Pistolero()}); champList.add(tristana);
        Champs twisted = new Champs(0, "Twisted Fate", Habilidad.twisted(), 0, 2, new Origen[]{origen.Pirata()}, new Clase[]{clase.Hechicero()}); champList.add(twisted);
        Champs varus = new Champs(0, "Varus", Habilidad.varus(), 0, 2, new Origen[]{origen.Demonio()}, new Clase[]{clase.Ranger()}); champList.add(varus);

        Champs vayne = new Champs (0, "Vayne", Habilidad.vayne(), 0, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Ranger()}); champList.add(vayne);
        Champs veigar = new Champs(0, "Veigar", Habilidad.veigar(), 0, 3, new Origen[]{origen.Yordle()}, new Clase[]{clase.Hechicero()}); champList.add(veigar);
        Champs volibear = new Champs(0, "Volibear", Habilidad.volibear(), 0, 3, new Origen[]{origen.Glacial()}, new Clase[]{clase.Luchador()}); champList.add(volibear);
        Champs warwick = new Champs(0, "Warwick", Habilidad.warwick(), 0, 1, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Luchador()}); champList.add(warwick);
        Champs yasuo = new Champs(0, "Yasuo", Habilidad.yasuo(), 0, 5, new Origen[]{origen.Exiliado()}, new Clase[]{clase.Espadachin()}); champList.add(yasuo);

        Champs zed = new Champs(0, "Zed", Habilidad.zed(), 0, 2, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(zed);
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
