package pk.cui.sc.CircleProject;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle();
		double radius1 = c1.getRadius();
		double area1 = c1.getArea();
		System.out.println(radius1);
		System.out.println(area1);
		
		Circle c2 = new Circle(3.5);
		double radius2 = c2.getRadius();
		double area2 = c2.getArea();
		System.out.println(radius2);
		System.out.println(area2);
	}

}
