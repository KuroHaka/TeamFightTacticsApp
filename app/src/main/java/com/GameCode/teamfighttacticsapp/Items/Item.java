package com.GameCode.teamfighttacticsapp.Items;

public class Item extends ItemPrimitivo {
        private ItemPrimitivo[] padres;

    public Item(String ImagePath, String name, String desc, ItemPrimitivo[] padres) {
        super(ImagePath, name, desc);
        this.padres = padres;
    }
}
