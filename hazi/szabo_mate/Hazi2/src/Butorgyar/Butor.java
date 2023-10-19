package Butorgyar;

import java.util.ArrayList;
import java.util.List;

public class Butor {
	private Butorlap[] lapok;
	private int szamol;

	public Butor() {
		lapok = new Butorlap[100];
		szamol = 0;

	}

	public void lapHozzaad(Butorlap valami) {
		if (szamol > 99)
			return;
		lapok[szamol] = valami;
		szamol = szamol + 1;

	}

	public double arSzamol() {
		double szum = 0f;
		int i = 0;
		while (i < szamol) {
			szum += lapok[i].arSzamol();
			i += 1;
		}
		return szum;
	}

	public String toString() {
		return "Butor - lapok: " + szamol + ", ar " + arSzamol() + " Ft";
	}

	
}
