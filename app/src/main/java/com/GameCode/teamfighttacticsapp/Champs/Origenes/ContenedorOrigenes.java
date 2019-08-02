package com.GameCode.teamfighttacticsapp.Champs.Origenes;

public class ContenedorOrigenes {
    private Origen demonio = new Origen("Pueden quemar todo el Maná del Campeón rival objetivo. Se activa con 2 demonios en tu tablero (30% de probabilidad, 50% con 4 y 70% con 6).");
    private Origen dragon = new Origen("Los dragones son inmunes al daño mágico. Se activa con 2 dragones en tu campo.");
    private Origen exiliado = new Origen("Comienza el combate con un escudo idéntico al 100% de sus puntos de vida máximos si no tiene aliados en parcelas adyacentes.");
    private Origen fantasma = new Origen("Maldice a un enemigo al comienzo de la batalla y comienza la partida con 100 puntos de vida. Se activa con dos fantasmas en tu tablero.");
    private Origen glacial = new Origen("Pueden aturdir al enemigo al impactarlos. Se activa con 2 glaciales en tu tablero (25% de probabilidad, 35% con 4 y 45% con 6).");
    private Origen imperial = new Origen("Los imperiales infligen el doble de daño. Se activa con 2 imperiales en tu tablero (un Imperial realiza el doble de daño y todos los imperiales infligen el doble de daño con cuatro imperiales en el tablero).");
    private Origen ninja = new Origen("Si tienes exactamente un sólo Ninja, éste recibirá 40% de daño de ataque extra. Si tienes exactamente cuatro ninjas, todos ellos recibirán 60% de daño de ataque extra.");
    private Origen noble = new Origen("100 de armadura a un aliado y 35 puntos de curación al golpear. Recibe la bonificación un aliado aleatorio con 3 nobles en tu tablero y la reciben todos con seis nobles en el tablero.");
    private Origen pirata = new Origen("Obtienes hasta 4 de oro extra en cada ronda de jugador contra jugador. Se activa con 3 piratas en tu tablero.");
    private Origen robot = new Origen("Los robots comienzan el combate con 100% de Maná. Se activa con un robot en tu tablero.");
    private Origen salvaje = new Origen("Cada ataque de una unidad les da Furia (hasta 5 acumulaciones). La Furia otorga 8% de velocidad de ataque por cada acumulación. Se activa con 2 salvajes en tu tablero y con 4 salvajes todo el equipo obtiene Furia.");
    private Origen vacio = new Origen("Los ataques de tu equipo ignoran el 50% de la armadura de tus enemigos. Se actica con 3 vacíos en tu tablero.");
    private Origen yordle = new Origen("Los ataques contra tus Yordles tienen un 20# de chances de fallar. Se activa con 3 Yordles en tu tablero. Las probabilidades incrementan a un 50% con 6 Yordles en tu tablero.");

    public ContenedorOrigenes() {
    }

    public Origen Demonio() {
        return demonio;
    }

    public Origen Dragon() {
        return dragon;
    }

    public Origen Exiliado() {
        return exiliado;
    }

    public Origen Fantasma() {
        return fantasma;
    }

    public Origen Glacial() {
        return glacial;
    }

    public Origen Imperial() {
        return imperial;
    }

    public Origen Ninja() {
        return ninja;
    }

    public Origen Noble() {
        return noble;
    }

    public Origen Pirata() {
        return pirata;
    }

    public Origen Robot() {
        return robot;
    }

    public Origen Salvaje() {
        return salvaje;
    }

    public Origen Vacio() {
        return vacio;
    }

    public Origen Yordle() {
        return yordle;
    }


}
