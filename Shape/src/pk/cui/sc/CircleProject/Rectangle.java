package pk.cui.sc.CircleProject;

public class Rectangle {

	private double width;
	private double length;
	
	Rectangle(){
		width = 3.5;
		length = 2.0;
	}
	
	Rectangle(double w, double l){
		width = w;
		length = l;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getArea(){
		return length*width;
	}
}
