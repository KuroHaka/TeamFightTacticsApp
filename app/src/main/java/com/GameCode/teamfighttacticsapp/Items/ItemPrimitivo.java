package com.GameCode.teamfighttacticsapp.Items;

public abstract class ItemPrimitivo  {
    private String name, desc;
    private int imagePath;

    public ItemPrimitivo(int imagePath, String name, String desc) {
        this.imagePath = imagePath;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImagePath() {
        return imagePath;
    }
    public abstract ItemPrimitivo[] getPadres();
}
