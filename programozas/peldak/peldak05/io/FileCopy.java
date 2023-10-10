import java.io.*;

public class FileCopy {
	
	public static void main(String[] args) {
	
		if (args.length < 2) {
			System.err.println(
				"Not enough command line arguments.");
		}
	
		String inFilename = args[0];
		String outFilename = args[1];

		File inFile = new File(inFilename);
		File outFile = new File(outFilename);

		try ( BufferedReader br = new BufferedReader(new FileReader(inFile));
			PrintWriter pw = new PrintWriter(outFile) ) {

			String line;
			for (line = br.readLine(); line != null; line = br.readLine() ) {			
				pw.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File cannot be opened.");
		} catch (IOException e) {
			System.err.println("An IO error occurred.");		
		}
	}
}
