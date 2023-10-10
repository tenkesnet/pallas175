/**
 * Komplex számok osztályának tesztelése.
 */

public class ComplexPolarTest{

    public static void main(String[] args){
        ComplexPolar a = new ComplexPolar();
		a.r = 1.2;
		a.theta = Math.PI / 4;
		System.out.println("Az első komplex szám: " + a.toString());
        ComplexPolar b = new ComplexPolar();
		b.r = 3;
		b.theta = Math.PI / 3;
		System.out.println("Az második komplex szám: " + b.toString());
        ComplexPolar c = new ComplexPolar();
		c = ComplexPolar.add(a,b);
		System.out.println("A két szám összege: " + c.toString());
		c = ComplexPolar.conjugate(c);
		System.out.println("A két szám összegének konjugáltja: " + c.toString());
		System.out.println("A konjugált modulusa: " + c.r);
		System.out.println("A konjugált szögértéke fokban: " + Angle.radianToDegree(c.theta));
		System.out.println("A konjugált szögértéke radiánban: " + c.theta);
		c = ComplexPolar.substract(a,b);
		System.out.println("A két szám különbsége: " + c.toString());
		c = ComplexPolar.multiply(a,b);
		System.out.println("A két szám szorzata: " + c.toString());
		int n = 5;
		c = c.powerN(c,n);
		System.out.println("A szorzat " + n + "-dik hatványa: " + c.toString()); 
    }
}