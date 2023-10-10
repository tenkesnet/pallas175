//beolvassa az emberek adatait egy file-bol

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class BeolvasEmber {

    public static void main ( String[] args ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(args[0]));
        List<Ember> emberek = new ArrayList<Ember>();
        
        while ( sc.hasNext() ) {
            emberek.add(new Ember(sc.nextLine()));
        }
        
        System.out.println(emberek);
    }
}
