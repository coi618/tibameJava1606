// Filename: TestStaticMethod.java

public class TestStaticMethod {

	public static void drawTriangle(int count) {
		int i, j;
		for(i=1; i<=count; i++) {
			for(j=1; j<=i; j++) 
				System.out.print("*");
			System.out.println();
		}

	}
	public static void main(String[] args) {
		System.out.println("Draw a triangle!");
		int count = 9;
		drawTriangle(count);
		System.out.println("Pretty well!");
	}


}
