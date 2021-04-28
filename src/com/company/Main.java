package com.company;

import Tim.Zaposleni;
import com.company.Projekat.Grupa;
import com.company.Projekat.Projekat;
import com.company.Projekat.Zadatak;

public class Main {

    public static void main(String[] args) {
        Zaposleni zap1 = new Zaposleni("Pera", "Peric", "email 1");
        Zaposleni zap2 = new Zaposleni("Jovo", "Jovic", "email 2");
        Zaposleni zap3 = new Zaposleni("Goran", "Jankovic", "email 3");
        Zaposleni zap4 = new Zaposleni("Mika", "Mikic", "email 4");

        Zadatak zad1 = new Zadatak("Prvi zadatak", "Neki opis", 14, 7, 2002);
        zad1.dodajZaposlenog(zap1);
        zad1.dodajZaposlenog(zap3);

        Zadatak zad2 = new Zadatak("Drugi zadatak", "Neki opis1", 15, 8, 2005);
        zad2.dodajZaposlenog(zap3);

        Zadatak zad3 = new Zadatak("Treci zadatak", "Neki opis2", 16, 9, 2008);
        zad3.dodajZaposlenog(zap1);
        zad3.dodajZaposlenog(zap2);
        zad3.dodajZaposlenog(zap3);
        zad3.dodajZaposlenog(zap4);

        Grupa grupa1 = new Grupa("OiP");
        grupa1.dodajZadatak(zad1);
        grupa1.dodajZadatak(zad3);

        Projekat projekat = new Projekat("Neki projekat", 321);
        projekat.dodajGrupu(grupa1);

        zad2.zatvoriZadatak();

        System.out.println(projekat);
    }
}