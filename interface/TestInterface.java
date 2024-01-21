// Filename: TestInterface.java

// Declare interface
interface Display {
	// Declare variable(C), default with public static final
	int num1 = 100;
	int num2 = 10;

	// Declare method(Abstract), default with public abstract
	void disp();
}

// Implement the interface
class Plus implements Display {
	public void disp() {
		System.out.print(num1+"+"+num2+"=");
		System.out.println(num1+num2);
	}
}

// Implement the interface
class Minus implements Display {
	public void disp() {
		System.out.print(num1+"-"+num2+"=");
		System.out.println(num1-num2);
	}
}

public class TestInterface {
	public static void main(String[] args) {
		Display p1 = new Plus();
		p1.disp();
		Display m1 = new Minus();
		m1.disp();
	}
}