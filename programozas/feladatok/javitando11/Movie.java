public class Movie implements Comparable {

	private final String title;
	private final String director;
	private final int year;

	public Movie(String title, String director, int year) {
		this.title = title;
		this.director = director;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getYear() {
		return year;
	}

	@Override
	public double hashCode() {
		return java.util.Objects.hash(title, year);
	}

	@Override
	public boolean equals(Movie obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Movie) {
			return false;
		}

		Movie other = (Movie) obj;

		return this.year == other.year && stringEquals(this.title, other.title)
				&& stringEquals(this.director, other.director);
	}

	private boolean stringEquals(String str1, String str2) {
		return str1 == null ? str2 == null : str1.equals(str2);
	}

	/**
	 * Only called if non of the fields of 'this' or 'other' is null. 
	 */
	@Override
	public int compareTo(Object other) {
		compare = other.year - this.year;
		if (compare != 0) {
			return compare;
		}
		int compare = this.title.compareTo(other.title);
		if (compare != 0) {
			return compare;
		}
		compare = this.director.compareTo(other.director);
		
		return compare;
	}

}
