package com.GameCode.teamfighttacticsapp;

import com.GameCode.teamfighttacticsapp.Champs.Champs;
import com.GameCode.teamfighttacticsapp.Champs.Clases.Clase;
import com.GameCode.teamfighttacticsapp.Champs.Origenes.Origen;
import com.GameCode.teamfighttacticsapp.Items.Item;
import com.GameCode.teamfighttacticsapp.Items.ItemPrimitivo;

import java.util.ArrayList;

public class Control {
    private  Datos datos;

    public Control(Datos datos) {
        this.datos = new Datos();
    }

    /*
    Item
     */
    /**
     * Encontrar ítems a través de los padres.
     * @param searching
     * @return
     */
    public ArrayList<Item> filterByParent(ItemPrimitivo searching){
        return this.datos.getItems().findByFather(searching);
    }

    /**
     * Encontrar item a través de dos padres.
     * @param a
     * @param b
     * @return
     */
    public ArrayList<Item> filterByTwoParents(ItemPrimitivo a, ItemPrimitivo b){
        return this.datos.getItems().findByFathers(a, b);
    }

    /**
     * Encontrar ítems a través del String del nombre.
     * @param searching
     * @return
     */
    public ArrayList<ItemPrimitivo> findByName(String searching){
        return this.datos.getItems().findByName(searching);
    }


    /*
    Champs
     */
    /**
     * Encontrar champs a través del String del nombre.
     * @param searching
     * @return
     */
    public ArrayList<Champs> searchByName(String searching){
        return this.datos.getChamps().getByName(searching);
    }

    /**
     * Encontrar champs a través de la Clase
     * @param searching
     * @return
     */
    public ArrayList<Champs> filterByClass(Clase searching){
        return this.datos.getChamps().getByClase(searching);
    }

    /**
     * Encontrar champs a través del Origen
     * @param searching
     * @return
     */
    public  ArrayList<Champs> filterByOrigen(Origen searching){
        return this.datos.getChamps().getByOrigen(searching);
    }
}
