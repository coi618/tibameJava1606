// Filename: TestFinalize.java

class ClassFinalize {
	protected void finalize() {
		System.out.println("finalize() executed.");
	}
}

public class TestFinalize {
	public static void main(String[] args) {
		ClassFinalize fin = new ClassFinalize();
		fin = null;
		System.out.println("Force garbage collect");
		System.gc();
	}
}