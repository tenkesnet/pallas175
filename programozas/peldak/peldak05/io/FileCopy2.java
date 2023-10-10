import java.io.*;	

public class FileCopy2 {

	public static void main(String[] args) {
	
		try {
			String contents = readFromFile(args[0]);
			printToFile(args[1], contents);
		} catch (IOException e) {
			System.err.println("An IO error occurred.");
		}
	}

	private static String readFromFile(String filename)
		throws FileNotFoundException, IOException {

		try ( BufferedReader br = new BufferedReader(
				new FileReader(new File(filename))) ) {

			String line;
			StringBuilder builder = new StringBuilder();
			for (line = br.readLine(); line != null; line = br.readLine() ) {
				
				builder.append(line).append("\n");
			}
			return builder.toString();
		}
	}
	
	private static void printToFile(String filename,
		String contents) throws FileNotFoundException {

		try ( PrintWriter pw =
				new PrintWriter(new File(filename)) ) {

			pw.print(contents);
			pw.flush();
		}
	}
	
}


