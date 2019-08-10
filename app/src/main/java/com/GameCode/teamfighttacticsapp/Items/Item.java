package com.GameCode.teamfighttacticsapp.Items;

public class Item extends ItemPrimitivo {
    private ItemPrimitivo[] padres;

    /**
     * Constructor de ítem con parámetros predeterminados.
     * @param ImagePath
     * @param name
     * @param desc
     * @param padres
     */
    public Item(int ImagePath, String name, String desc, ItemPrimitivo[] padres) {
        super(ImagePath, name, desc);
        this.padres = padres;
    }

    /*
    Getters
     */
    /**
     * Getter de los padres del ítem, solo válido con ítems no primitivos.
     * @return
     */
    public ItemPrimitivo[] getPadres() {
        return padres;
    }

    @Override
    public boolean equals(Object o){
        if(((Item)o).getName().equals(this.getName())){
            return true;
        }
        return false;
    }

}
