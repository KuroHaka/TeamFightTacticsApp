package com.GameCode.teamfighttacticsapp.Items;

import com.GameCode.teamfighttacticsapp.Champs.Champs;
import com.GameCode.teamfighttacticsapp.R;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemContainer {
    protected ArrayList<ItemPrimitivo> itemList;

    /*
    public ItemContainer(ArrayList<ItemPrimitivo> itemList) {
        this.itemList = itemList;
    }*/

    public ItemContainer() {
        ItemPrimitivo espadon = new ItemPrimitivo(R.drawable.espadon_base, "Espadón", "+20 de daño"); itemList.add(espadon);
        ItemPrimitivo chaleco = new ItemPrimitivo(R.drawable.cotademalla_base, "Chaleco  de cadenas", "+20 de armadura"); itemList.add(chaleco);
        ItemPrimitivo arco = new ItemPrimitivo(R.drawable.arcorecurvo_base, "Arco curvo", "+20% de velocidad de ataque"); itemList.add(arco);
        ItemPrimitivo lagrima = new ItemPrimitivo(R.drawable.lagrimadeladiosa_base, "Lágrima de la diosa", "+20 de maná"); itemList.add(lagrima);
        ItemPrimitivo capa = new ItemPrimitivo(R.drawable.capanegatron_base, "Capa negatrón", "+20 de resistencia mágica"); itemList.add(capa);
        ItemPrimitivo cinturon = new ItemPrimitivo(R.drawable.cinturondelgigante_base, "Cinturón de gigante", "+200 de vida"); itemList.add(cinturon);
        ItemPrimitivo vara = new ItemPrimitivo(R.drawable.varainnecesariamentegrande_base, "Vara innecesariamente grande", "+20% de poder de hechizo"); itemList.add(vara);
        ItemPrimitivo espatula = new ItemPrimitivo(R.drawable.espatula_base, "Espátula", "Tiene que hacer algo..."); itemList.add(espatula);
        Item rabadon = new Item(R.drawable.rabadon_vara_vara, "Sombrero mortal de Rabadon", "El poder de hechizo del portador aumenta un 50%", new ItemPrimitivo[]{vara}); itemList.add(rabadon);
        Item filoInfinito = new Item(R.drawable.filoinfinito_espadon_espadon,"Filo Infinito","+40 daño de ataque. +100 % daño en golpe crítico",new ItemPrimitivo[]{espadon}); itemList.add(filoInfinito);
        Item corazon = new Item(R.drawable.corazonhelado_lagrima_cota, "Corazón de hielo", "Los enemigos adyacentes pierden un 25% de velocidad de ataque", new ItemPrimitivo[]{lagrima, chaleco}); itemList.add(corazon);
        Item quietud = new Item(R.drawable.hush_lagrima_negatron, "Quietud", "Al impactar, los ataques tienen una alta probabilidad de silenciar, lo que impide que el enemigo lance hechizos durante 3s", new ItemPrimitivo[]{lagrima, capa}); itemList.add(quietud);
        Item redencion = new Item(R.drawable.redencion_lagrima_cinturon, "Redención", "Al tener menos del 25% de la vida, cura 1000 de vida a todos los aliados cercanos", new ItemPrimitivo[]{lagrima, cinturon}); itemList.add(redencion);
        Item cefiro = new Item(R.drawable.cefiro_negatron_cinturon, "Céfiro", "Al comienzo del combate, destierra a un enemigo durante 5s", new ItemPrimitivo[]{capa, cinturon}); itemList.add(cefiro);
        Item hoja = new Item(R.drawable.hojadelreyarruinado_arco_espatula, "Hoja del rey arruinado", "AS +20 adicional. El portador también es un espadachín", new ItemPrimitivo[]{arco,espatula}); itemList.add(hoja);
        Item zeke = new Item(R.drawable.heraldodezeke_espadon_cinturon, "Heraldo de Zeke", "Al comienzo del combate, la velocidad de ataque de los aliados que estén a 2 hexágonos de distancia en la misma fila aumenta un 15% durante el resto del combate", new ItemPrimitivo[]{espadon, cinturon}); itemList.add(zeke);
        Item guinsoo = new Item(R.drawable.guinsoo_arco_vara, "Hoja de furia de Guinsoo", "Los ataques proporcionan un 4% de velocidad de ataque. Se acumula de forma infinita", new ItemPrimitivo[]{arco, vara}); itemList.add(guinsoo);
        Item chispa = new Item(R.drawable.chispaionica_vara_negatron, "Chispa iónica","Cuando un enemigo lanza un hechizo, recibe 150 de daño", new ItemPrimitivo[]{vara, capa}); itemList.add(chispa);
        Item garra = new Item(R.drawable.garradedragon_espatula_espatula, "Garra de dragón", "Obtiene un 83% de resistencia al daño mágico", new ItemPrimitivo[]{capa}); itemList.add(garra);
        Item bailarin = new Item(R.drawable.bailarinfantasmal_arco_cota, "Bailarín espectral", "El portador esquiva todos los impactos críticos", new ItemPrimitivo[]{arco, chaleco}); itemList.add(bailarin);
        Item espinas  = new Item(R.drawable.chalecodeespinas_cota_cota, "Malla de espinas", "Refleja un 100% del daño mitigado de ataques", new ItemPrimitivo[]{chaleco}); itemList.add(espinas);
        Item roja = new Item(R.drawable.buforojo_arco_cota, "Mejora roja", "Los ataques infligen daño por quemadura equivalente al 13% de la vida máxima del enemigo a lo largo de 5s e impiden que el objetivo se cure", new ItemPrimitivo[]{chaleco, cinturon}); itemList.add(roja);
        Item dioses = new Item(R.drawable.hojadivina_espadon_arco, "Espada de los dioses", "Cada segundo, el portador tiene una probabilidad del 5% de lograr un golpe crítico", new ItemPrimitivo[]{espadon, arco}); itemList.add(dioses);
        Item maldita = new Item(R.drawable.hojamaldita_arco_negatron, "Hoja maldita", "Al impactar, los ataques tienen una baja probabilidad de reducir en 1 el nivel de estrellas del enemigo durante el resto del combate", new ItemPrimitivo[]{arco, capa}); itemList.add(maldita);
        Item angel = new Item(R.drawable.angelguardian_esp_cota, "Ángel de la guarda", "El portador revive con 1000 de vida", new ItemPrimitivo[]{espadon, chaleco}); itemList.add(angel);
        Item serafin = new Item(R.drawable.serafin_lagrima_lagrima, "Abrazo del serafín", "El portador recupera 20 de mana después de lanzar una habilidad", new ItemPrimitivo[]{lagrima}); itemList.add(serafin);
        Item runaan = new Item(R.drawable.huracanderunaan_negatron_espatula, "Huracán de Runaan", "MR +20 adicional. Invoca a un espíritu que imita tus ataques e inflige un 25% de daño", new ItemPrimitivo[]{capa, espatula}); itemList.add(runaan);
        Item sanguinaria = new Item(R.drawable.samguinaria_espadon_negatron, "La sanguinaria", "Los ataques curan un 50% del daño", new ItemPrimitivo[]{espadon, capa}); itemList.add(sanguinaria);
        Item promesa = new Item(R.drawable.knightsvow_cota_espatula, "Promesa de caballero", "Armadura +20 adicional. El portador también es un caballero", new ItemPrimitivo[]{chaleco, espatula}); itemList.add(promesa);
        Item mazo = new Item(R.drawable.mazohelado_espatula_cinturon, "Mazo helado", "Vida +200 adicional. El portador también es un glacial", new ItemPrimitivo[]{espatula, cinturon}); itemList.add(mazo);
        Item hidra = new Item(R.drawable.hidratitanica_arco_cinturon, "Hidra titánica", "Los ataques infligen un 10% de la vida máxima del portador como daño por salpicadura", new ItemPrimitivo[]{arco, cinturon}); itemList.add(hidra);
        Item oscuro = new Item(R.drawable.darkin_lagrima_espatula, "Oscuro", "Mana +20 adicional. EL portador también es un demonio", new ItemPrimitivo[]{lagrima, espatula}); itemList.add(oscuro);
        Item shojin = new Item(R.drawable.lanzadeshojin_espadon_lagrima, "Lanza de Shojin", "Tras el lanzamiento, el portador obtiene un 15% de su maná máximo por ataque", new ItemPrimitivo[]{espadon, lagrima}); itemList.add(shojin);
        Item youmuu = new Item(R.drawable.filofantasmaldeyoumuu_espadon_espatula, "Filo fantasmal de Youmuu", "AD +20 adicional. El portador también es un asesisno", new ItemPrimitivo[]{espadon, espatula}); itemList.add(youmuu);
        Item luden = new Item(R.drawable.ecodeluden_vara_lagrima, "Eco de Luden", "Los hechizos infligen 200 de daño por salpicadura al impactar", new ItemPrimitivo[]{vara, lagrima}); itemList.add(luden);
        Item solari = new Item(R.drawable.solari_vara_cota, "Medallón de los Solari de Hierro", "Al comienzo del combate, los aliado que estén a 2 hexágonos de distancia en la misma fila obtienen un escudo que bloquea 250 de daño", new ItemPrimitivo[]{vara, chaleco}); itemList.add(solari);
        Item yuumi = new Item(R.drawable.yuumi_vara_espatula, "Yuumi", "AP +20 adicional. El portador también es un hechicero", new ItemPrimitivo[]{vara, espatula}); itemList.add(yuumi);
        Item morellonomicon = new Item(R.drawable.morellonomicon_vara_cinturon, "Morellonomicón", "Los hechios infligen daño por quemadura equivalente al 25% de la vida máxima del enemigo a lo largo de 5s e impiden que el objetivo se cure", new ItemPrimitivo[]{vara, cinturon}); itemList.add(morellonomicon);
        Item rapido = new Item(R.drawable.canondefuegorapido_arco_arco, "Cañón de fuego rápido", "Los ataques del portador no se pueden esquivar. Duplica el alcance de ataque", new ItemPrimitivo[]{arco}); itemList.add(rapido);
        Item rompeespadas = new Item(R.drawable.rompespadas_cota_negatron, "Rompeespadas", "Los ataques tienen probabilidad de desarmar durante 4s", new ItemPrimitivo[]{chaleco, capa}); itemList.add(rompeespadas);
        Item naturaleza = new Item(R.drawable.fuerzadelanaturaleza_espatula_espatula, "Fuerza de la naturaleza", "Obtiene +1 de tamaño del equipo", new ItemPrimitivo[]{espatula}); itemList.add(naturaleza);
        Item warmong = new Item(R.drawable.warmong_cinturon_cinturon, "Armadura de Warmong", "El portador regenera un 6% de su vida máxima por segundo", new ItemPrimitivo[]{cinturon}); itemList.add(warmong);
        Item statikk = new Item(R.drawable.colmillodestatikk_arco_lagrima, "Puñal de Statikk", "Cada tercer ataque inflige 90 de daño mágico por salpicadura", new ItemPrimitivo[]{arco, lagrima}); itemList.add(statikk);
        Item hextech = new Item(R.drawable.hojapistolahextech_espadon_vara, "Sable-pistola hextech", "Cura un 33% de todo el daño infligido", new ItemPrimitivo[]{espadon, vara}); itemList.add(hextech);



    }

    public ArrayList<ItemPrimitivo> getItemList() {
        return itemList;
    }

    public ArrayList<ItemPrimitivo> findByName(String searching){
        ArrayList<ItemPrimitivo> searched = new ArrayList<>();
        Iterator<ItemPrimitivo> iter = itemList.iterator();
        while(iter.hasNext()){
            //INTRODUCIR AQUÍ TIPO DE BÚSQUEDA
            if (iter.next().getName().contains(searching)){
                searched.add(iter.next());
            }
        }
        return searched;
    }

    public ArrayList<Item> findByFather(ItemPrimitivo father){
        ArrayList<Item> searched = new ArrayList<>();
        Iterator<ItemPrimitivo> iter = itemList.iterator();
        while(iter.hasNext()){
            if (((Item)iter.next()).getPadres()[0] == father || ((Item)iter.next()).getPadres()[1] == father ){
                searched.add((Item)iter.next());
            }
        }
        return searched;
    }
}
