package Butorgyar;

public class Butorlap {
	private double hossz;
	private double szeles;
	private String tipus;
	private final double hatlapAr = 500;
	private final double tartolapAr = 5000;

	// tipus tartolap hatlap

	public Butorlap(String tipus, double szelesseg, double hosszusag) {
		setTipus(tipus);
		setSzeles(szelesseg);
		setHossz(hosszusag);

	}

	public double arSzamol() {
		if (tipus == "hatlap") {
			return hossz * szeles * hatlapAr;
		} else
			return hossz * szeles * tartolapAr;
	}

	public double getHossz() {
		return hossz;
	}

	public void setHossz(double hossz) {
		this.hossz = hossz / 100;
	}

	public double getSzeles() {
		return szeles;
	}

	public void setSzeles(double szeles) {
		this.szeles = szeles / 100;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		if (tipus == "hatlap" || tipus == "tartolap") {
			this.tipus = tipus;
		} else
			System.out.println("Ejnye");
	}

}
