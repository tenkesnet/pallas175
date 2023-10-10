class Rectangle extends Shape{

    private double length;
    private double width;
	
	public Rectangle(Point p, double length, double width) {
		super(p.x,p.y);
        this.length = length;  
		this.width = width;
    }

    public Rectangle(double x, double y) {
        super(x,y);
    }

    public Rectangle() {
		super();
	}
	
	public double getLength() { 
        return length; 
    }
    
	public void setLength(double l) {
        if (l < 0) {
           l = -l;
        }
        length = l; 
    }
	
    public double getWidth() { 
        return width;  
    }
    
    public void setWidth(double w) {
        if (w < 0) {
            w = -w;
        }
        width  = w; 
    }

   public double getArea() {
		super.area = width * length;
        return super.getArea();
    }

    public double getCircumference() {
		super.circumference = 2*(width + length);
        return super.getCircumference();
    }

	public String toString() {
        return super.toString() + ", hosszúság = " + length + ", szélesség = " + width;
    } 
	
}