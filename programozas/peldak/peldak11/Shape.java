class Shape{

    private Point center;
	protected double area;
    protected double circumference;

    public Shape(double x, double y) {
        center = new Point(0.0,0.0);
		center.x = x;
        center.y = y;
    }

    public Shape() {
		center = new Point(0.0,0.0);
	}

    public Point getCenter() {
        Point result = new Point(0.0,0.0);
		result.x = center.x;
        result.y = center.y;
        return result;
    }

    public void setCenter(Point center) {
        this.center.x = center.x;
		this.center.y = center.y;
    }
	
	public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

	public void move(double dx, double dy) {
        center.move(dx, dy);
    }
	
	public void toCenterPoint(Point p) {
        center = p;
    }

	public String toString() {
        return "középpont = (" +  center.x + ", " + center.y + ")";
    }
}