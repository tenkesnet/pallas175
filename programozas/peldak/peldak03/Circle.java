public class Circle {

    private Point center;
    private double radius;
    
    public Circle(Point p, double radius) {
        center = new Point(p.getX(),p.getY()); 
        this.radius = radius;  
    }
    
    public Circle(double x, double y) {
        center = new Point(x,y);
    }
    
    public Circle() {
        //a double -double parameteru konstruktor hivasa
        this(0.0,0.0);
    }
    
    public Point getCenter() {
        return new Point(center.getX(),center.getY());
    }
    
    public void setCenter(Point center) {
        this.center = new Point(center.getX(),center.getY());
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        if (r < 0.0) r = 0.0;
        radius = r;
    }
    
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }
    
    public void enlarge(double factor) {
        radius *= factor;
    }
}
