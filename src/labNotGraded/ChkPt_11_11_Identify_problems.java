package labNotGraded;

public class ChkPt_11_11_Identify_problems {
	private double radius;
	
	public ChkPt_11_11_Identify_problems(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class C extends ChkPt_11_11_Identify_problems {
	private double length;
	
	C(double radius, double length) {
		super(radius);
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return getArea() * length;
	}
}