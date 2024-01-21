// Filename: TestAbstract.java

abstract class Pen {
	// protected: 相同套件或子類別可存取
	protected String brand;
	protected double price;

	// Abstract method
	public abstract void write();

	public void setdata(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
}

// 自訂的筆類別(子類別)
class MyPen extends Pen{
	// 實做 write()
	public void write() {
		// brand, price 可以直接存取是因為 SuperClass Pen 設定為 protected
		System.out.print("Brand is: "+brand);
		System.out.println(", price is: "+ price);
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		Pen myPen = new MyPen();
		myPen.setdata("SKB", 10);
		myPen.write();
	}
}