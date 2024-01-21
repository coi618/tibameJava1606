// Filename: TestAutoboxing.java

// Error before Java 5

public class TestAutoboxing {
	public static void main(String[] args) {
		Integer i1 = 1; // boxing
		int i2 = i1; // unboxing

		int sum1 = i1+i2;
		Integer sum2 = i1+i2;
		System.out.println(sum1);
		System.out.println(sum2);
	}
}