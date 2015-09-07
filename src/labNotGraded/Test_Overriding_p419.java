package labNotGraded;

public class Test_Overriding_p419 {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.p(10);
		a.p(10.0);
	}
}

class Bb {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class Aa extends Bb {
	// This method overrides the method in B
	public void p(double i) {
		System.out.println(i);
	}
}

// When you run this, both a.p(10) and a.p(10.0) invoke the p(double i) method defined in class A to display 10.0.