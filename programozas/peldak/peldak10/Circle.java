class Circle extends Shape{

    private double radius;
	
	public Circle(Point p, double radius) {
		super(p.x,p.y);
        this.radius = radius;  
    }

    public Circle(double x, double y) {
        super(x,y);
    }

    public Circle() {
		super();
	}
	
	public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r < 0.0) r = 0.0;
        radius = r;
    }

    public void enlarge(double factor) {
        radius *= factor;
    }
	
	public double getArea() {
		super.area = Math.PI*radius*radius;
        return super.getArea();
    }

    public double getCircumference() {
		super.circumference = 2*Math.PI*radius;
        return super.getCircumference();
    }
	
    public boolean liesWithin(Point p, double delta) {
        return Math.abs(super.getCenter().distance(p) - radius) < delta;
    }
	
	public boolean isInside(Point p) {
        return (Math.pow(p.x - super.getCenter().getX(),2)+Math.pow(p.y - super.getCenter().getY(),2)<= Math.pow(radius,2));
    }

	public String toString() {
        return super.toString() + ", sugár = " +  radius;
    }
	
}




