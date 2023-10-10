import java.util.ArrayList;
import java.util.List;

public class Book {
	static enum Genre {
		FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
	}

  public final Genre genre;
	public final String author;
	public final String title;
	public final int hammerPrice;
	public final int id;
	private static int lastId; 
	public static void resetId(){lastId = 0;}
	
	private Book(String author, String title, Genre genre, int reservePrice) {
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.hammerPrice = reservePrice;
		id = lastId++;
	}
	
	
	// 3*2*2
	public static List<Book> make(List<String> lines) {
		ArrayList<Book> books = new ArrayList<>();
		for (String line : lines) {
			// Giles Andreae;GIRAFFES CAN'T DANCE;PHILOSOPHY;50000

			String[] parts = line.split(";");			
			if (parts.length == 4) {					
				Book b = make(parts[0], parts[1], parts[2], parts[3]);
				if (b != null) {
					books.add(b);
				}
			}
			
		}
		return books;
	}

	// 1 + 1 + 4 + 3*3
	public static Book make(String artist, String title, String genreName,
			String reservePriceStr) {		
		try {
			int reservePrice = Integer.parseInt(reservePriceStr);
			
			if (artist == null || title == null || title.length() < 2
					|| reservePrice <= 0)
				return null;
			
			Genre g = Genre.valueOf(genreName);

			int i = 0;

			while (i < title.length()) {
				if (Character.isLetter(title.charAt(i)) ||
						Character.isDigit(title.charAt(i)) ||
						Character.isWhitespace(title.charAt(i))){
					++i;		
					
				} else {
					return null;
				}
				
			}
			return new Book(artist, title, g, reservePrice);
		} catch (NumberFormatException e) {
			return null;
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}
