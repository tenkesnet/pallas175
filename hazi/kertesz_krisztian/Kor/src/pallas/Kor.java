package pallas;

public class Kor {
	public double sugár;

	public Kor() {
	}

	public Kor (double sugár) {
		this.sugár=sugár;
	}

	public void terület() {
		double eredmény;
		eredmény = 3.14 * (sugár * sugár);
		System.out.println("A Kör területe: " + eredmény);
	}

	public void kerület() {
		double eredmény;
		eredmény = 2 * 3.14 * sugár;
		System.out.println("A Kör kerülete: " + eredmény);
	}

}