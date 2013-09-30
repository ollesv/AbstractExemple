package shapes;

public class Rectangle extends GeometricShape {
	
	private double length;
	private double width;
	
	public Rectangle(int x, int y, int l, int w){
		center[0] = x;
		center[1] = y;
		length = l;
		width = w;		
	}

	public double getCircumference() {
		return length * width;
	}

}
