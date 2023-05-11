package Osoba;

import Magazyn.Magazyn;

public class Osoba {

	private String imie;
	private String nazwisko;
	private String PESEL;
	private String login;
	private String haslo;

	public Osoba(String imie, String nazwisko, String PESEL, String login, String haslo) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.PESEL = PESEL;
		this.login = login;
		this.haslo = haslo;
	}

	public void wyswietlMagazyn(Magazyn magazyn) {
		System.out.println(magazyn.toString());
	}

	public void wyswietlPlatnosc() {
		// TODO - implement Osoba.wyswietlPlatnosc
		throw new UnsupportedOperationException();
	}

}