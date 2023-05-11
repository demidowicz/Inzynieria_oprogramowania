import Osoba.*;
import Magazyn.*;

public class Main {
    public static void main(String[] args) {


        Produkt cebula = new Produkt("Cebula", false, true);
        cebula.dodajPartie(new Partia(2015, 7, "Tesco"));
        cebula.dodajPartie(new Partia(2016, 72, "Lidl"));
        cebula.dodajPartie(new Partia(2017, 29, "Biedronka"));

        Produkt kurczak = new Produkt("Kurczak", false, false);
        kurczak.dodajPartie(new Partia(2004, 1000, "Farma"));

        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt(cebula);
        magazyn.dodajProdukt(kurczak);

        Osoba Jan_kierownik = new Kierownik("Jan", "Kowalski", "123", "jankowalski123", "konik");
        Jan_kierownik.wyswietlMagazyn(magazyn);
    }
}