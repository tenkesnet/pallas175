import java.util.Arrays;

public class IntegerMatrix {
	private int rowNum;
	private int colNum;
	private Integer[][] data;

	public static void main(String[] args){
		Integer[] linearData = {0, 0, 1, 2, 3, 4};
		System.out.println(new IntegerMatrix(2, 3, linearData));
	}


	public IntegerMatrix(int rowNum, int colNum, Integer[] linearData){
		if(rowNum*colNum != linearData.length)
			throw new IllegalArgumentException("rowNum*colNum != linearData.length");
		
		this.rowNum = rowNum;
		this.colNum = colNum;
		data = new Integer[rowNum][colNum];

		for(int i = 0; i < linearData.length; i++) {
			int row = (int) Math.floor(i / colNum);  // típuskényszerítés
			int col = i % colNum;

			System.out.println(i + " " + row + " " +col );
			data[row][col] = linearData[i];
		}
	}

	public String toString(){
   		// BAJ: Nehezen olvasható, ráadásul a feltétel-kiértékelések nem hatékonyak, az értékadás gyorsabb.
		// return toString1();

		// BAJ: a String immutable, minden konkatenációkor új példány készül, ráadásul mindig be kell járni. O(n^3)
		// return toString2();

		return toString3();

		// TODO ld. még: java 8 megoldások
	}

	public String toString1(){
		String s = "";

		// első sor
		if(data.length < 1) return s;

		// első sor első elem
		s += data[0].length < 1 ? "" : data[0][0]; 

		// első sor többi elem
		for(int j=1; j<data[0].length; j++){
			s += "," + data[0][j]; 
		}

		// többi sor
		for(int i=1; i<data.length; i++){
			s += ";";

			// i-edik sor első elem
			s += data[i].length < 1 ? "" : data[i][0]; 
			// i-edik sor többi elem
			for(int j=1; j<data[i].length; j++){
				s += "," + data[i][j]; 
			}
		}

		return s;
	}

	public String toString2(){
		String s = "";
		String rowDelim = "";
		String colDelim = "";

		for(Integer[] row : data){
			s += rowDelim;
			rowDelim = ";";
			for(Integer elem :row){
				s += colDelim;
				colDelim = ",";

				s += elem;
			}
			colDelim = "";
		}
		return s;
	}

	public String toString3(){
		StringBuilder sb = new StringBuilder();
		String rowDelim = "";
		String colDelim = "";

		for(Integer[] row : data){
			sb.append(rowDelim);
			rowDelim = ";";
			for(Integer elem : row){
				sb.append(colDelim);
				colDelim = ",";

				sb.append(elem);
			}
			colDelim = "";
		}

		return sb.toString();
	}
}
