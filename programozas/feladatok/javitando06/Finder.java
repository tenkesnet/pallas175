package findinfiles;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.io.*;


public class Finder{

	PrintWriter out;
	public Finder(String output)
	{
		this.out = new PrintWriter(output);
	}
	public void close(){
		this.out.close();
	}

	public void printFile(String filePath) 
	{
		File f = new File(filePath);
		printFile(f);
	}
	public boolean findText(String textToFind, String filePath) 
	{
		File f = new File(filePath);
		return findText(textToFind,f);
	}
	
		
	public void printFile(File f) throws IOException
	{
		if(f.isDirectory)
		{
			List<File> fileList = Arrays.asList(f.listFiles());
			for(File file : fileList)
				printFile(file);	
		}
		else{
		//File f  = new File(filePath);
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				this.out.println(sc.nextLine());
			}

		}
	}
	
	public boolean findText(String textToFind, File f)
	{
		//File f  = new File(filePath);
		if(f.isDirectory)
		{
			List<File> fileList = Arrays.asList(f.listFiles());
			for(File file : fileList)
				if(findText(textToFind,file))
					return true;
			return false;			
		}
		else{
			BufferedReader r = new BufferedReader(new FileReader(f));
			String  s= "";
			while((s = r.readLine())!= null)
			{
				if(s.contains(textToFind)){
					r.close();
					this.out.println(true);
					return true;
					}
			}
			
			this.out.println(false);
			return false;
		}
	}
	
	
}