package labNotGraded;

public class Test_Overloading_p419 {
	public static void main(String[] args) {
		A a = new A();
		a.p(10);
		a.p(10.0);
	}
}

class B {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A extends B {
	// This method overloads the method in B ^
	public void p(int i) {
		System.out.println(i);
	}
}

// When you run this, a.p(10) invokes the p(int i) method defined in class A to display 10
// and a.p(10.0) invokes the p(double i) method defined in class B to display 20.0.