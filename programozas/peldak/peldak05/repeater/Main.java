// Main.java
public class Main {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		print(args[1], i);
	}

	public static void print(String text, int times) {
		Repeater repeater = new Repeater();
		
		// repeater.text = text;
		
		repeater.println(times);
	}
}
