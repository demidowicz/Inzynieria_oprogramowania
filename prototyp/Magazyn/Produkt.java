package Magazyn;

import java.util.*;

public class Produkt {

	LinkedList<Partia> partie;
	private int id;
	private String nazwa;
	private int ilosc;
	private boolean czyGluten;
	private boolean czyWege;

	public Produkt(String nazwa, boolean czyGluten, boolean czyWege) {
		this.partie = new LinkedList<>();
		this.id = -1;
		this.nazwa = nazwa;
		this.czyGluten = czyGluten;
		this.czyWege = czyWege;
	}

	public void dodajPartie(Partia partia) {
		this.partie.add(partia);
		partia.setId(partie.indexOf(partia));
		this.ilosc += partia.getIlosc();
	}

	@Override
	public String toString() {
		String partieString = "\n";
		for (Partia partia : partie) {
			partieString += partia.toString() + "\n";
		}
		return "Produkt{ " +
				"id='" + id + '\'' +
				", nazwa='" + nazwa + '\'' +
				", ilosc=" + ilosc +
				", czyGluten=" + czyGluten +
				", czyWege=" + czyWege +
				"\nPartie:"  + partieString +
				"}";
	}

	public int getIlosc() {
		return ilosc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}