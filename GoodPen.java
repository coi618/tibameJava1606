// filename: GoodPen.java
class GoodPen {
	
	private String brand;
	private double price;

	// default Constructor, other Constructors will call this one.
	public GoodPen(String brand, double price) {
		this.brand = brand; 
		if(price > 0) {
			this.price = price;
		} else {
			System.out.println("Please check pen's price.");
		}
	}

	public GoodPen(double price) {
		// Call default Constructor
		this("SKB", price);
	}

	public GoodPen(String brand) {
		// Call default Constructor
		this(brand, 10);
	}

	public GoodPen() {
		// Call default Constructor
		this("SKB", 10);
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
}