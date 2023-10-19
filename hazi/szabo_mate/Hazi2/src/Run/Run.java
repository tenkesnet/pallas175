package Run;

import Butorgyar.Butor;
import Butorgyar.Butorlap;

public class Run {

	public static void main(String[] args) {
		Butor szek = new Butor();
		Butorlap hat = new Butorlap("hatlap", 35, 55);
		Butorlap uloke = new Butorlap("tartolap", 45, 50);
		Butorlap lab1 = new Butorlap("tartolap", 10, 5);
		Butorlap lab2 = new Butorlap("tartolap", 10, 5);
		Butorlap lab3 = new Butorlap("tartolap", 10, 5);
		Butorlap lab4 = new Butorlap("tartolap", 10, 5);
		szek.lapHozzaad(hat);
		szek.lapHozzaad(uloke);
		szek.lapHozzaad(lab1);
		szek.lapHozzaad(lab2);
		szek.lapHozzaad(lab3);
		szek.lapHozzaad(lab4);
System.out.println(szek);
	}
}
