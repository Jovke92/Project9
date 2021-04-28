package com.company.Projekat;

import Tim.Zaposleni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadatak implements Comparable<Zadatak> {
    private String naziv;
    private String opis;
    private String stanje = "Aktivan.";
    private List<Zaposleni> listaZaposlenih = new ArrayList<>();
    private int dan;
    private int mesec;
    private int godina;

    public Zadatak(String naziv, String opis, int dan, int mesec, int godina) {
        this.naziv = naziv;
        this.opis = opis;
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    public String getStanje() {
        return stanje;
    }

    public List<Zaposleni> getListaZaposlenih() {
        return listaZaposlenih;
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void dodajZaposlenog (Zaposleni zaposleni) {
        listaZaposlenih.add(zaposleni);
        Collections.sort(listaZaposlenih);
    }

    public int ukupnoZaposlenih() {
        return listaZaposlenih.size();
    }

    public void zatvoriZadatak () {
        stanje = "Gotov.";
    }

    @Override
    public int compareTo(Zadatak o) {
        if(godina < o.getGodina()) {
            return 1;
        } else if(godina == o.getGodina() && mesec < o.getMesec()) {
            return 1;
        } else if(godina == o.getGodina() && mesec == o.getMesec() && dan < o.getDan()) {
            return 1;
        } else if(godina == o.getGodina() && mesec == o.getMesec() && dan == o.getDan()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        String s = naziv + " ({" + dan + "}).{" + mesec + "}.{" + godina + "}) - Stanje " + stanje + "\n";
        for (Zaposleni zaposleni : listaZaposlenih) {
            s += zaposleni.toString() + "\n";
        }
        return s;
    }
}