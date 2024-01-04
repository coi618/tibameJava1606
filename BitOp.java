// filename: BitOp.java

public class BitOp {
	public static void main(String[] args) {
		int a = 0b11110000;
		System.out.println("a = "+Integer.toBinaryString(a));
		System.out.println("~a = "+Integer.toBinaryString(~a));
		int b = 0b10101010;
		System.out.println("b = "+Integer.toBinaryString(b));
		System.out.println("a&b = "+Integer.toBinaryString((a&b)));
		System.out.println("a|b = "+Integer.toBinaryString((a|b)));
		System.out.println("a^b = "+Integer.toBinaryString((a^b)));
	}
}