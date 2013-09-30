package shapes;

public class Circle extends GeometricShape{
	
	private double radius;
	
	public Circle (int x, int y, double r){
		center[0] = x;
		center[1] = y;
		radius = r;
	}
	
	public double getCircumference() {
		return radius * 2 * Math.PI ;
	}

}
