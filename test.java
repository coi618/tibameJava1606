// filename: test.java

public class test {
	public static void main(String[] args) {	
		GoodPen p1 = new GoodPen("SKB", 10);
		GoodPen p2 = new GoodPen("Pentel", 50);
		GoodPen p3 = new GoodPen("Pilot", 35);
		GoodPen p4 = new GoodPen("Lion", -20);

		System.out.println(p4.getPrice());
	}
}
