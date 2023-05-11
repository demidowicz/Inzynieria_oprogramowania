package Osoba;

import java.util.*;

public class Pracownik extends Osoba {

	Collection<Premia> premie;
	Collection<Platnosc> platnosci;

	public Pracownik(String imie, String nazwisko, String PESEL, String login, String haslo) {
		super(imie, nazwisko, PESEL, login, haslo);
	}

	public boolean zapiszPlatnosc() {
		// TODO - implement Pracownik.zapiszPlatnosc
		throw new UnsupportedOperationException();
	}

	public boolean edytujMagazyn() {
		// TODO - implement Pracownik.edytujMagazyn
		throw new UnsupportedOperationException();
	}

}