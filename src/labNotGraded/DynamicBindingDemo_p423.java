package labNotGraded;
public class DynamicBindingDemo_p423 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new GraduateStudent());			// (1)
		m(new Student());					// (2)
		m(new Person());					// (3)
		m(new Object());					// (4)
	}										//
											//
	public static void m(Object x) { 		// this method takes a parameter of the Object type and can be invoked with any object (e.g. new GraduateStudent(), new Student(), new Person()...etc) 
		System.out.println(x.toString());	// when this method is executed, the argument x's toString method is invoked. x may be an instance of GraduateStudent, Student, Person, or Object.
	}										//
}											//
											//
class GraduateStudent extends Student {		// The classes GraduateStudent, Student,   -|
}											// Person, or Object have their own		   	|
											// implementations of the toString method. 	|
class Student extends Person {				//										    |
	@Override								//										   	|
	public String toString() {				//	<<---------------------------------------
		return "Student";					//											|
	}										//											|
}											//											|
											//											|
class Person extends Object {				//											|
	@Override								//											|
	public String toString() {				//  <<---------------------------------------
		return "Person";					//
	}										// Which implementation is used will be determined by x's actual type at runtime. 
}											// Invoking (2) causes the toString method defined in the Student class to be invoked (output: "Student")
											// Invoking (3) causes the toString method defined in the Person class to be invoked  (output: "Person")
											// Invoking (4) causes the toString method defined in the Object class to be invoked  (output: "java.lang.Object@8aee908")