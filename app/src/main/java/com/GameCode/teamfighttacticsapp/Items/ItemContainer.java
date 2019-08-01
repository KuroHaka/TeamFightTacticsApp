package com.GameCode.teamfighttacticsapp.Items;

import com.GameCode.teamfighttacticsapp.R;

import java.util.ArrayList;

public class ItemContainer {
    protected ArrayList<ItemPrimitivo> itemList;

    /*
    public ItemContainer(ArrayList<ItemPrimitivo> itemList) {
        this.itemList = itemList;
    }*/

    public ItemContainer() {
        ItemPrimitivo espadon = new Item(R.drawable.espadon_base, "Espadón", "Daño +20",new ItemPrimitivo[]{});
        Item filoInfinito = new Item(R.drawable.filoinfinito_espadon_espadon,"Filo Infinito","+40 daño de ataque. +100 % daño en golpe crítico",new ItemPrimitivo[]{espadon,espadon});
        itemList.add(espadon);
        itemList.add(filoInfinito);
    }

    public ArrayList<ItemPrimitivo> getItemList() {
        return itemList;
    }
}
