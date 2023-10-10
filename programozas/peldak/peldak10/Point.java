class Point{

    public double x;
    public double y;
	
	public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
	
	public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
	
	public void setY(double y) {
        this.y = y;
    }
	
    public void move(double dx, double dy) {
		x += dx;
		y += dy;
    }
	
	public double distance(Point p) {
        return distance(this, p);
    }
	
	public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";    
    }
	
}