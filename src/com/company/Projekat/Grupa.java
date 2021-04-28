package com.company.Projekat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupa {
    private String naziv;
    private List<Zadatak> listaZadataka = new ArrayList<>();

    public Grupa(String naziv) {
        this.naziv = naziv;
        this.listaZadataka = listaZadataka;
    }

    public void dodajZadatak(Zadatak zadatak) {
        listaZadataka.add(zadatak);
        Collections.sort(listaZadataka);
    }

    public int ukupnoZaposlenihNaAktivnim() {
        int ukupno = 0;
        for(Zadatak zadatak : listaZadataka) {
            if(zadatak.getStanje().equals("Aktivan")) {
                ukupno += zadatak.ukupnoZaposlenih();
            }
        }
        return ukupno;
    }

    public int ukupnoZaposlenihNaGotovim() {
        int ukupno = 0;
        for(Zadatak zadatak : listaZadataka) {
            if(zadatak.getStanje().equals("Gotov")) {
                ukupno += zadatak.ukupnoZaposlenih();
            }
        }
        return ukupno;
    }

    public int ukupnoAktivnihZadataka() {
        int ukupno = 0;
        for (Zadatak zadatak : listaZadataka) {
            if (zadatak.getStanje().equals("Aktivan")) {
                ukupno++;
            }
        }
        return ukupno;
    }

    public int ukupnoZaposlenih() {
        int ukupno = 0;
        for(Zadatak zadatak : listaZadataka) {
            ukupno += zadatak.ukupnoZaposlenih();
        }
        return ukupno;
    }

    public String toString() {
        String s = "Grupa " + naziv + " ({" + ukupnoZaposlenih() + "} zaposlenih na {" + listaZadataka.size() + "} zadataka)\n";
        for (Zadatak zadatak : listaZadataka) {
            s += zadatak + "\n";
        }
        return s;
    }
}