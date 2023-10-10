//ember nyilvantartasa

import java.util.Scanner;
import java.io.File;

public class Ember {
    private int    azonosito;
    private String nev;
   
    public Ember(int azonosito, String nev) {
        this.azonosito = azonosito;
        this.nev       = nev;
    }
    
    public Ember(String input) {
        Scanner sc = new Scanner(input);
        azonosito = sc.nextInt();
        nev       = sc.nextLine().trim();
    }
    
    public int getAzonosito() {
        return azonosito;
    }
    
    public String getNev() {
        return nev;
    }
    
    @Override
    public String toString() {
        return "(Azonosito: " + azonosito + ", nev: " + nev + ")";
    }
}
