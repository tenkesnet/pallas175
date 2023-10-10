class Circle {
	public static int counter = 0; 
    private int x, y;  private double radius;
    private static void incrementCounter(){counter++;} 
    public Circle(String sx, String sy, String sradius){
    			incrementCounter();
    			x = Integer.parseInt(sx);
    }
  
}
public class Main{
      public static void main(String[] args){
                Circle.incrementCounter();
                System.out.println(Circle.counter);
                Circle c1 = new Circle("1","2","3"); 
                c1.incrementCounter();
                System.out.println(Circle.counter);
                System.out.println(c1.counter);
    }   
}

