
public class CopyWithoutDuplicates {
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Not enough command line arguments.");
		}
		try {
			copy(args[0], args[1]);
		} catch (FileNotFoundException e) {
			System.err.println("One of the files cannot be opened.");
		}
	}
	
	private static void copy(String input, String output) {

		try ( Scanner sc = new Scanner(input);
			PrintWriter pw = new PrintWriter(output) ) {

			String previous = null;
			
			while (sc.hasNextLine()) {
				String current = sc.nextLine();
				if ( previous != current ) {
					pw.println(current);
				}
				previous = current;
			}
		}
	}
}
