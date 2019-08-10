package com.GameCode.teamfighttacticsapp;

import com.GameCode.teamfighttacticsapp.Champs.ChampContainer;
import com.GameCode.teamfighttacticsapp.Items.ItemContainer;

public class Datos {
    private ChampContainer Champs;
    private ItemContainer Items;

    public Datos() {
        Champs = new ChampContainer();
        Items = new ItemContainer();
    }

    /*
    Getters
     */
    public ChampContainer getChamps() {
        return Champs;
    }

    public ItemContainer getItems() {
        return Items;
    }
}
