/**
 * Komplex számok polárkoordinátás (trigonometrikus) alakja.
 */
    
public class ComplexPolar{
	
    public double r;        // nemnegatív szám, a komplex szám modulusa
    public double theta;    // szögérték

    public double re() { return r * Math.cos(theta); } //a komplex szám valós részének kiszámítása
    public double im() { return r * Math.sin(theta); } //a komplex szám képzetes részének kiszámítása
	
	// komplex számok algebrai alakját polárkoordinátássá alakítja
	public ComplexPolar toPolar (double re, double im) {
		ComplexPolar a = new ComplexPolar();
        a.r     = Math.sqrt(re*re + im*im);
        a.theta = Math.atan2(im, re);
		return a;
    }

	// komplex szám konjugáltja
    public static ComplexPolar conjugate(ComplexPolar a) {   
        return a.toPolar(a.re(), - a.im());
    }
	
    // komplex számok összeadása
    public static ComplexPolar add(ComplexPolar a, ComplexPolar b) {
		ComplexPolar c = new ComplexPolar();
        double re = a.re() + b.re();
        double im = a.im() + b.im();
        return c.toPolar(re, im);
    }
	
	// komplex számok kivonása
    public static ComplexPolar substract(ComplexPolar a, ComplexPolar b) {
		ComplexPolar c = new ComplexPolar();
        double re = a.re() - b.re();
        double im = a.im() - b.im();
        return c.toPolar(re, im);
    }
	
	// két komplex szám szorzata
	public static ComplexPolar multiply(ComplexPolar a, ComplexPolar b) {
		ComplexPolar c = new ComplexPolar();
        c.r = a.r * b.r;
        c.theta = a.theta + b.theta;
        return c;
    }
	
	// komplex szám n-dik hatványa
	public ComplexPolar powerN(ComplexPolar a, int n) {
		return a.toPolar(Math.pow(a.r,n) * Math.cos(n * a.theta), Math.pow(a.r,n) * Math.sin(n * a.theta));
    }
	
	// a komplex szám sztring reprezentációja
    public String toString()  {
		if (im() == 0) return re() + "";
        if (re() == 0) return im() + " i";
        if (im() <  0) return re() + " - " + (-im()) + " i";
        return re() + " + " + im() + " i";
    }
}