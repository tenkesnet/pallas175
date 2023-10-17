package butorgyar;

public class Butorlap {

	public float hosszúság, szélesség;
	String típus;
	final float tartólapÁr = 5000f;
	final float hátlapÁr = 500f;

	public Butorlap() {
	}

	public Butorlap(String típus, float hosszúság, float szélesség) {
		this.hosszúság = hosszúság;
		this.szélesség = szélesség;
		this.típus = típus;
	}

	public void arSzamol() {
		float hossz = hosszúság / 100f;
		float szél = szélesség / 100f;
		float négyzetméter = hossz * szél;
		if (típus == "tartólap") {
			float ar = négyzetméter * tartólapÁr;
			System.out.println(ar);

		} else if (típus == "hátlap") {
			float ar = négyzetméter * hátlapÁr;
			System.out.println(ar);
		}
	}

}