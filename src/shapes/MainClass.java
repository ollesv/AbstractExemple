package shapes;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(1, 1, 3, 4);
		Circle c = new Circle(1, 1, 3);
		Square sq = new Square(1, 1, 8, 8);
		ArrayList<GeometricShape> gList = new ArrayList<GeometricShape>();
		gList.add(r);
		gList.add(c);
		gList.add(sq);
		for (GeometricShape g : gList) {
			System.out.println("circumference: " + g.getCircumference());
		}
	}
}
