import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String filepath = args[0]; // abszol\'ut vagy relat\'iv \'ut
		File file = new File(filepath);
		
		readWithBufferedReader(file);
		// readWithScanner(file);
		// printToFile(file, new String[] { "Hello", "World!" });
	}
	
	private static void readWithBufferedReader(File file) {
		try ( BufferedReader br = new BufferedReader(new FileReader(file)) ) {
			String line;
			for (line = br.readLine(); line != null; line = br.readLine()) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist.");
		} catch (IOException e) {
			System.err.println("An IO error occurred.");	
		}
	}
	
	private static void readWithScanner(File file) {
		try ( Scanner sc = new Scanner(file) ) {	
			while (sc.hasNextLine()) {
				String line = sc.nextLine();		
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist.");
		}

	}
	
	private static void printToFile(File file, String[] linesToWrite) {
		try ( PrintWriter pw = new PrintWriter(file) ) {

			for (String line : linesToWrite) {
				pw.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File cannot be opened.");
		}		
	}
	
}
