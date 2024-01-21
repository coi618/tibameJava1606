// Filename: TestWrapper.java
public class TestWrapper {
	public static void main(String[] args) {
		Integer wInt = new Integer(1); //boxing
		int x = wInt.intValue(); // unboxing
		int y = Integer.parseInt("1");
		System.out.println(x+y);

		Integer i1 = new Integer(1);

		System.out.println(wInt == 1);
		System.out.println(wInt.equals(i1));
	}
}