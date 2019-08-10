package com.GameCode.teamfighttacticsapp.Items;

public class ItemPrimitivo  {
    private String name, desc;
    private int imagePath;

    /**
     * Constructor de ítems primitivos con parámetros predeterminados.
     * @param imagePath
     * @param name
     * @param desc
     */
    public ItemPrimitivo(int imagePath, String name, String desc) {
        this.imagePath = imagePath;
        this.name = name;
        this.desc = desc;
    }

    /*
    Getters
     */
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImagePath() {
        return imagePath;
    }

    @Override
    public boolean equals(Object o){
        if(((Item)o).getName().equals(this.getName())){
            return true;
        }
        return false;
    }

}

