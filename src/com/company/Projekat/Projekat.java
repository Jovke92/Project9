package com.company.Projekat;

import java.util.ArrayList;

public class Projekat {
    private String naziv;
    private int sifra;
    private ArrayList<Grupa> listaGrupa;

    public Projekat(String naziv, int sifra) {
        this.naziv = naziv;
        this.sifra = sifra;
        listaGrupa = new ArrayList<>();
    }

    public void dodajGrupu(Grupa grupa) {
        listaGrupa.add(grupa);
    }

    @Override
    public String toString() {
        String s = "- " + naziv + "\n- ";
        for(Grupa grupa : listaGrupa) {
            s += grupa + "\n";
        }
        return s;
    }
}