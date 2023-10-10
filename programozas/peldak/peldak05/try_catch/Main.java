public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Hello, " + args[0] + "!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(
				"Not enough command line arguments.");
			// standard error kimenetre irunk
		} finally {
			System.out.println("bye");
		}
	}

}
