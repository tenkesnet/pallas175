
import java.util.List;
import java.util.ArrayList;

public class Fruit {
    private String name;
    private int price;
    
    private static Fruit cheapestFruit;
    public static void resetCheapest(){
      cheapestFruit = null;
    }
    
    private Fruit(String name, int price) {
        this.name = name;
        this.price = price;
        
        if ((cheapestFruit == null) || (price < cheapestFruit.price))
            cheapestFruit = this;
    }
    
    public static List<Fruit> make(List<String> lines) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        for (String line : lines) {
        // korte,130

            String[] parts = line.split(",");			
            if (parts.length == 2) {					
                Fruit f = make(parts[0], parts[1]);
                if (f != null) {
                    fruits.add(f);
                }
            }

        }
        return fruits;
    }

    public static Fruit make(String name, String priceStr) {
      try {
        int price = Integer.parseInt(priceStr);
        if (name == null || name.length() < 2 || price <= 0 || price > 5000 || price%5 != 0) return null;
        
        int i = 0;
        while (i < name.length()) {
            if (!Character.isLetter(name.charAt(i))) return null;
            ++i;
        }
        
        return new Fruit(name, price);
      } catch(NumberFormatException e){
        return null;
      }
    }
    
    public int getPrice() {
        return price;
    }
    
    public boolean cheaperThan(Fruit other) {
        return (price < other.price);
    }
    
    public String show() {
        if (price >= 1000)
            return String.format("%s (%d %03d Ft)", name, price/1000, price%1000);
        else
            return String.format("%s (%d Ft)", name, price);
    }
    
    public static Fruit getCheapestFruit() {
        return cheapestFruit;
    }
}
