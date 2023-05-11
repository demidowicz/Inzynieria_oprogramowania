package Magazyn;

import java.util.*;

public class Magazyn {

	LinkedList<Produkt> produkty;
	private int ilosc_produktow;

	private int ilosc_unikalnych_produktow;

	public Magazyn() {
		this.produkty = new LinkedList<>();
		this.ilosc_unikalnych_produktow = 0;
	}

	public void dodajProdukt(Produkt produkt) {
		this.produkty.add(produkt);
		produkt.setId(produkty.indexOf(produkt));
		this.ilosc_produktow += produkt.getIlosc();
		this.ilosc_unikalnych_produktow += 1;
	}

	@Override
	public String toString() {
		String magazynString = "\n";
		for (Produkt produkt : produkty) {
			magazynString += produkt.toString() + "\n";
		}
		return "Magazyn{ " +
				"ilosc_produktow=" + ilosc_produktow + ", ilosc_unikalnych_produktow=" + ilosc_unikalnych_produktow +
				"\nProdukty:" + magazynString  +
				'}';
	}
}