class ShapeTest{

    public static void main(String[] args) {
        Point p = new Point(1.22,1.33);
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.setX(1.23);
		p.setY(2.56);
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.move(1.22,1.33);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Circle c = new Circle();
		
		c.setCenter(p);
		c.setRadius(3.21);
		System.out.println(c.getRadius());
		c.move(1.22,1.33);
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
		
		c.enlarge(2);
		
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
		System.out.println(c.getRadius());
		
		System.out.println(c.toString());
		
		Point q = new Point(1.1, 2.2);
		
		System.out.println(q.getX());
		System.out.println(q.getY());
		
		System.out.println(q.distance(p));
		System.out.println(Point.distance(p,q));
		System.out.println(p);
		System.out.println(q);
		
		Circle a = new Circle(q, 3.4);
		
		System.out.println(a.getCenter().getX());
		System.out.println(a.getCenter().getY());
		System.out.println(a.getRadius());
		
		System.out.println(a);
		
		Circle b = new Circle(1.3,4.5);
		
		System.out.println(b.getCenter().getX());
		System.out.println(b.getCenter().getY());
		System.out.println(b.getRadius());
		
		System.out.println(b.getArea()); 
		System.out.println(b.getCircumference());
		
		System.out.println(b);
		
		b.toCenterPoint(q);
		
		System.out.println(b.liesWithin(q, 4.5));
		System.out.println(b.isInside(p));
		
		b.move(4.1, 3.2);
		
		Point r = new Point(4.1, 3.2);
		
		System.out.println(r.getX());
		System.out.println(r.getY());
		
		Rectangle d = new Rectangle(r, 3.2, 2.3); 
		
		System.out.println(d.getCenter().getX());
		System.out.println(d.getCenter().getY());
		System.out.println(d.getLength());
		System.out.println(d.getWidth());
		
		System.out.println(d.getArea()); 
		System.out.println(d.getCircumference());
	
		System.out.println(d);
		
		Rectangle e = new Rectangle(1.2, 4.5); 
		
		System.out.println(e.getCenter().getX());
		System.out.println(e.getCenter().getY());
		System.out.println(e.getLength());
		System.out.println(e.getWidth());
		
		System.out.println(e);
		
        Rectangle f = new Rectangle();
		
		System.out.println(f.getCenter().getX());
		System.out.println(f.getCenter().getY());
		System.out.println(f.getLength());
		System.out.println(f.getWidth());
		
		System.out.println(f);
		
		Object o = new Rectangle(r, 4.2, 1.3); 
		
		System.out.println(((Rectangle)o).getCenter().getX());
		System.out.println(((Rectangle)o).getCenter().getY());
		System.out.println(((Rectangle)o).getLength());
		System.out.println(((Rectangle)o).getWidth());
		
		System.out.println(((Rectangle)o).getArea()); 
		System.out.println(((Rectangle)o).getCircumference());
	
		String u = o.toString();
		String v = ((Rectangle)o).toString();
		String w = o.toString();
		System.out.println(u == w);
		System.out.println(u.equals(w));
		w = u;
		System.out.println(u == w);
		System.out.println(u);
		System.out.println(v);
    }
	
}