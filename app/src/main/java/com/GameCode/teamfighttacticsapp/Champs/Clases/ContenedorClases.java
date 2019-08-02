package com.GameCode.teamfighttacticsapp.Champs.Clases;

import com.GameCode.teamfighttacticsapp.Champs.Champs;
import com.GameCode.teamfighttacticsapp.Items.Item;

import java.util.ArrayList;

public class ContenedorClases {
    private Clase asesino = new Clase("Los asesinos ganan 150% de daño crítico. Se activa con 3 asesinos en tu tablero. Si hay 6 asesinos se incrementa al 300%.");
    private Clase cambiaformas = new Clase("Ganan 100% de vida máxima al transformarse. Se activa con 3 cambiaformas en el tablero.");
    private Clase elementalista = new Clase("En cada combate, invocan un monstruo elemental. Se activa con 3 elementalistas en el tablero.");
    private Clase espadachin = new Clase("Los espadachines obtienen un 35% de chances de realizar un ataque consecutivo. Se activa con 3 espadachines en tu tablero. Al juntar 6 espadachines se pueden realizar hasta dos ataques extras.");
    private Clase hechicero = new Clase("Los hechiceros le otorgan a todo el equipo Poder de Habilidad extra. 35 puntos de Poder de Habiidad con 3 magos en el equipo y 100 puntos con 6.");
    private Clase guardian = new Clase("Los guardianes otorgan 30 puntos de armadura a los guardianes y aliados que comienzan el combate en una posición adyacente a ellos.");
    private Clase pistolero = new Clase("Los pistoleros obtienen un 50% de probabilidades de atacar a un enemigo adicional. Esta habilidad se activa con 2 pistoleros en tu tablero y se incrementa a todos los enemigos dentro del rango si hay 4 pistoleros juntos.");
    private Clase ranger = new Clase("Cada tres segundos, los rangers tienen la posibilidad de duplicar su velocidad de ataque por 3 segundos. 25% de probabilidades con 2 rangers y 65% con 4.");
    private Clase luchador = new Clase("Los luchadores obtienen 300 puntos de Vida extra al haber al menos 2 en el tu tablero. Si hay 4 o más, la vida se incrementa a 700 puntos extra.");
    private Clase caballero = new Clase(" Los caballeros bloquean daño de los ataques básicos. 20 puntos de daño bloqueado con 2 caballeros, 40 con 4 y 60 con 6.");

    public ContenedorClases() {
    }

    public Clase Asesino() {
        return asesino;
    }

    public Clase Cambiaformas() {
        return cambiaformas;
    }

    public Clase Elementalista() {
        return elementalista;
    }

    public Clase Espadachin() {
        return espadachin;
    }

    public Clase Hechicero() {
        return hechicero;
    }

    public Clase Guardian() {
        return guardian;
    }

    public Clase Pistolero() {
        return pistolero;
    }

    public Clase Ranger() {
        return ranger;
    }

    public Clase Luchador(){
        return luchador;
    }

    public Clase Caballero(){
        return caballero;
    }
}
