package labNotGraded;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create and initialize two objects
		
		Object butthole = new CircleFromSimpleGeometricObject(1);
		Object taint = new RectangleFromSimpleGeometricObject(2, 4);
		
		// Display circle and rectangle
		displayObject(butthole);
		displayObject(taint);
		System.out.println(taint.equals(butthole));
	}
	
	public static void displayObject(Object object) 
	{
		if (object instanceof CircleFromSimpleGeometricObject) 
		{
			System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject) object).getArea());
			System.out.println("The diameter is " + ((CircleFromSimpleGeometricObject) object).getDiameter());
		}
		else if (object instanceof RectangleFromSimpleGeometricObject)
		{
			System.out.println("The area of the rectangle is " + ((RectangleFromSimpleGeometricObject) object).getArea());
		}
	}
}
