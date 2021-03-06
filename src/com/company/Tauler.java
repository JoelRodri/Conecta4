package com.company;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Tauler implements Serializable {
    public Map<String,Integer> map_jugadors;
    public int resultat = 3, acabats;
    private int numPlayers;

    public Tauler() {
        map_jugadors = new HashMap<>();
        acabats = 0;
    }
    public int getNumPlayers() {
        return numPlayers;
    }

    public void addNUmPlayers() {
        this.numPlayers++;
    }

    public void put(String s,int i){
        map_jugadors.put(s,i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Intents\n");
        map_jugadors.forEach((k,v) -> sb.append(k + " - " + v + "\n"));
        return sb.toString();
    }
}

class Jugada implements Serializable {
    String Nom;
    String OtroString;
    int num;
    int OtroInt;
    String numeroDeJugador;
}
