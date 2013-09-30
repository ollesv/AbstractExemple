package shapes;

public abstract class GeometricShape {
	
	protected int[] center;
	
	public GeometricShape(){
		center = new int[2];
		center[0] = center[1] = 0;
	}
	
	public int getX(){
		return center[0];
	}
	
	public int getY(){
		return center[1];
	}
	
	public abstract double getCircumference();

}
