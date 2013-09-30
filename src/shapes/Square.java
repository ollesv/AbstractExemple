package shapes;

public class Square extends GeometricShape {

	private double w, h;

	public Square(int x, int y, int w, int h) {
		center[0] = x;
		center[1] = y;
		this.w = w;
		this.h = h;

	}

	public double getCircumference() {
		return 2 * w + 2 * h;
	}

}
