package com.GameCode.teamfighttacticsapp.Champs;

import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Clases.ContenedorClases;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.ContenedorOrigenes;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;
import com.GameCode.teamfighttacticsapp.R;


import java.util.ArrayList;
import java.util.Iterator;

public class ChampContainer {
    private ArrayList<Champs> champList;

    public ArrayList<Champs> getChampList() {
        return champList;
    }

    public ChampContainer() {
        ContenedorClases clase = new ContenedorClases();
        ContenedorOrigenes origen = new ContenedorOrigenes();
        HabilidadContainer Habilidad = new HabilidadContainer();
        //RELLENAR DE CAMPEONES
        Champs aatrox = new Champs(R.drawable.aatrox_champ, "Aatrox", Habilidad.aatrox(), 3, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Espadachin()}); champList.add(aatrox);
        Champs ahri =   new Champs(R.drawable.ahri_champ, "Ahri", Habilidad.ahri(), 2, 2, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Hechicero()}); champList.add(ahri);
        Champs akali =  new Champs(R.drawable.akali_champ, "Akali", Habilidad.akali(), 4, 4, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(akali);
        Champs anivia = new Champs(R.drawable.anivia_champ, "Anivia", Habilidad.anivia(), 5, 5, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(anivia);
        Champs ashe =   new Champs (R.drawable.ashe_champ, "Ashe", Habilidad.ashe(), 3, 3, new Origen[]{origen.Glacial()}, new Clase[]{clase.Ranger()}); champList.add(ashe);

        Champs aurelion = new Champs(R.drawable.aurelion_champ, "Aurelion Sol", Habilidad.aurelion(), 4, 4, new Origen[]{origen.Dragon()}, new Clase[]{clase.Hechicero()}); champList.add(aurelion);
        Champs blitzcrank = new Champs(R.drawable.blitzcrank_champ, "Blitzcrank", Habilidad.blitzcrank(), 2, 2, new Origen[]{origen.Robot()}, new Clase[]{clase.Luchador()}); champList.add(blitzcrank);
        Champs brand = new Champs(R.drawable.brand_champ, "Brand", Habilidad.brand(), 4, 4, new Origen[]{origen.Demonio()}, new Clase[]{clase.Elementalista()}); champList.add(brand);
        Champs braum = new Champs(R.drawable.braum_champ, "Braum", Habilidad.braum(), 2, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Guardian()}); champList.add(braum);
        Champs cho = new Champs(R.drawable.cho_champ, "Cho'Gath", Habilidad.cho(), 4, 4, new Origen[]{origen.Vacio()}, new Clase[]{clase.Luchador()}); champList.add(cho);

        Champs darius = new Champs(R.drawable.darius_champ, "Darius", Habilidad.darius(), 1, 1, new Origen[]{origen.Imperial()}, new Clase[]{clase.Caballero()}); champList.add(darius);
        Champs draven = new Champs(R.drawable.draven_champ, "Draven", Habilidad.draven(), 4, 4, new Origen[]{origen.Imperial()}, new Clase[]{clase.Espadachin()}); champList.add(draven);
        Champs elise = new Champs(R.drawable.elise_champ, "Elise", Habilidad.elise(), 1, 2, new Origen[]{origen.Demonio()}, new Clase[]{clase.Cambiaformas()}); champList.add(elise);
        Champs evelynn = new Champs(R.drawable.evelynn_champ, "Evelynn", Habilidad.evelynn(), 3, 3, new Origen[]{origen.Demonio()}, new Clase[]{clase.Asesino()}); champList.add(evelynn);
        Champs fiora = new Champs(R.drawable.fiora_champ, "Fiora", Habilidad.fiora(), 1, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Espadachin()}); champList.add(fiora);

        Champs gangplank = new Champs(R.drawable.gangplank_champ, "Gangplak", Habilidad.gangplank(), 3, 3, new Origen[]{origen.Pirata()}, new Clase[]{clase.Espadachin(), clase.Pistolero()}); champList.add(gangplank);
        Champs garen = new Champs(R.drawable.garen_champ, "Garen", Habilidad.garen(), 1, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(garen);
        Champs gnar = new Champs(R.drawable.gnar_champ, "Gnar", Habilidad.gnar(), 4, 4, new Origen[]{origen.Salvaje(), origen.Yordle()}, new Clase[]{clase.Cambiaformas()}); champList.add(gnar);
        Champs graves = new Champs(R.drawable.graves_champ, "Graves",Habilidad.graves(), 1, 1, new Origen[]{origen.Pirata()}, new Clase[]{clase.Pistolero()}); champList.add(graves);
        Champs khartus = new Champs(R.drawable.khartus_champ, "Khartus", Habilidad.khartus(), 5, 5, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Hechicero()}); champList.add(khartus);

        Champs kassadin = new Champs (R.drawable.kassadin_champ, "Kassadin", Habilidad.kassadin(), 1, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Hechicero()}); champList.add(kassadin);
        Champs katarina = new Champs(R.drawable.katarina_champ, "Katarina", Habilidad.katarina(), 3, 3, new Origen[]{origen.Imperial()}, new Clase[]{clase.Asesino()}); champList.add(katarina);
        Champs kayle = new Champs (R.drawable.kayle_champ, "Kayle", Habilidad.kayle(), 5,5, new Origen[]{origen.Noble()}, new Clase[]{clase.Caballero()}); champList.add(kayle);
        Champs kennen = new Champs(R.drawable.kennen_champ, "Kennen", Habilidad.kennen(), 3, 3, new Origen[]{origen.Ninja(), origen.Yordle()}, new Clase[]{clase.Elementalista()}); champList.add(kennen);
        Champs kha = new Champs(R.drawable.kha_champ, "Kha'Zix", Habilidad.kha(), 1, 1, new Origen[]{origen.Vacio()}, new Clase[]{clase.Asesino()}); champList.add(kha);

        Champs kindred = new Champs(R.drawable.kindred_champ, "Kindred", Habilidad.kindred(), 4, 4, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Ranger()}); champList.add(kindred);
        Champs leona = new Champs(R.drawable.leona_champ, "Leona", Habilidad.leona(), 4, 4, new Origen[]{origen.Noble()}, new Clase[]{clase.Guardian()}); champList.add(leona);
        Champs lissandra = new Champs(R.drawable.lissandra_champ, "Lissandra", Habilidad.lissandra(), 2, 2, new Origen[]{origen.Glacial()}, new Clase[]{clase.Elementalista()}); champList.add(lissandra);
        Champs lucian = new Champs(R.drawable.lucian_champ, "Lucian", Habilidad.lucian(), 2, 2, new Origen[]{origen.Noble()}, new Clase[]{clase.Pistolero()}); champList.add(lucian);
        Champs lulu = new Champs(R.drawable.lulu_champ, "Lulu", Habilidad.lulu(), 2, 2, new Origen[]{origen.Yordle()}, new Clase[]{clase.Hechicero()}); champList.add(lulu);

        Champs miss = new Champs(R.drawable.miss_champ, "Miss Fortune", Habilidad.miss(), 5, 5, new Origen[]{origen.Pirata()}, new Clase[]{clase.Pistolero()}); champList.add(miss);
        Champs mordekaiser = new Champs(R.drawable. mordekaiser_champ, "Mordekaiser", Habilidad.mordeakiser(), 1, 1, new Origen[]{origen.Fantasma()}, new Clase[]{clase.Caballero()}); champList.add(mordekaiser);
        Champs morgana = new Champs(R.drawable.morgana_champ, "Morgana", Habilidad.morgana(), 3, 3, new Origen[]{origen.Demonio()}, new Clase[] {clase.Hechicero()}); champList.add(morgana);
        Champs nidaleee = new Champs(R.drawable.nidalee_champ, "Nidaleee", Habilidad.nidalee(), 1, 1, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Cambiaformas()}); champList.add(nidaleee);
        Champs poppy = new Champs(R.drawable.poppy_champ, "Poppy", Habilidad.poppy(), 3, 3, new Origen[]{origen.Yordle()}, new Clase[]{clase.Caballero()}); champList.add(poppy);

        Champs pyke = new Champs(R.drawable.pyke_champ, "Pyke", Habilidad.pyke(), 2, 2, new Origen[]{origen.Pirata()}, new Clase[]{clase.Asesino()}); champList.add(pyke);
        Champs rek = new Champs(R.drawable.rek_champ, "Rek'Sai", Habilidad.rek(), 2, 2, new Origen[]{origen.Vacio()}, new Clase[]{clase.Luchador()}); champList.add(rek);
        Champs rengar = new Champs(R.drawable.rengar_champ, "Rengar", Habilidad.rengar(), 3, 3, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Asesino()}); champList.add(rengar);
        Champs sejuani = new Champs(R.drawable.sejuani_champ, "Sejuani", Habilidad.sejuani(), 4, 4, new Origen[]{origen.Glacial()}, new Clase[]{clase.Caballero()}); champList.add(sejuani);
        Champs shen = new Champs(R.drawable.shen_champ, "Shen", Habilidad.shen(), 2, 2, new Origen[]{origen.Ninja()}, new Clase[]{clase.Espadachin()}); champList.add(shen);

        Champs shyvana = new Champs(R.drawable.shyvana_champ, "Shyvana", Habilidad.shyvana(), 3, 3, new Origen[]{origen.Dragon()}, new Clase[]{clase.Cambiaformas()}); champList.add(shyvana);
        Champs swain = new Champs(R.drawable.swain_champ, "Swain", Habilidad.swain(), 5, 5, new Origen[]{origen.Demonio(), origen.Imperial()}, new Clase[]{clase.Cambiaformas()}); champList.add(swain);
        Champs tristana = new Champs(R.drawable.tristana_champ, "Tristana", Habilidad.tristana(), 1, 1, new Origen[]{origen.Yordle()}, new Clase[]{clase.Pistolero()}); champList.add(tristana);
        Champs twisted = new Champs(R.drawable.twisted_champ, "Twisted Fate", Habilidad.twisted(), 2, 2, new Origen[]{origen.Pirata()}, new Clase[]{clase.Hechicero()}); champList.add(twisted);
        Champs varus = new Champs(R.drawable.varus_champ, "Varus", Habilidad.varus(), 2, 2, new Origen[]{origen.Demonio()}, new Clase[]{clase.Ranger()}); champList.add(varus);

        Champs vayne = new Champs (R.drawable.vayne_champ, "Vayne", Habilidad.vayne(), 1, 1, new Origen[]{origen.Noble()}, new Clase[]{clase.Ranger()}); champList.add(vayne);
        Champs veigar = new Champs(R.drawable.veigar_champ, "Veigar", Habilidad.veigar(), 3, 3, new Origen[]{origen.Yordle()}, new Clase[]{clase.Hechicero()}); champList.add(veigar);
        Champs volibear = new Champs(R.drawable.volibear_champ, "Volibear", Habilidad.volibear(), 3, 3, new Origen[]{origen.Glacial()}, new Clase[]{clase.Luchador()}); champList.add(volibear);
        Champs warwick = new Champs(R.drawable.warwick_champ, "Warwick", Habilidad.warwick(), 1, 1, new Origen[]{origen.Salvaje()}, new Clase[]{clase.Luchador()}); champList.add(warwick);
        Champs yasuo = new Champs(R.drawable.yasuo_champ, "Yasuo", Habilidad.yasuo(), 5, 5, new Origen[]{origen.Exiliado()}, new Clase[]{clase.Espadachin()}); champList.add(yasuo);

        Champs zed = new Champs(R.drawable.zed_champ, "Zed", Habilidad.zed(), 2, 2, new Origen[]{origen.Ninja()}, new Clase[]{clase.Asesino()}); champList.add(zed);
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
