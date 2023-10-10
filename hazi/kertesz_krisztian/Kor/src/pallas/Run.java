package pallas;

public class Run {
	public static void main(String[] args) {

		Kor Kör1 = new Kor(25);
		Kor Kör2 = new Kor(42);
		System.out.println("Kör 1 adatai: ");
		Kör1.terület();
		Kör1.kerület();
		System.out.println("Kör 2 adatai: ");
		Kör2.terület();
		Kör2.kerület();

	}
}