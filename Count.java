// filename: Count.java

// package xxx;

public class Count {
	// product series number
	private int serialNumber;

	public int getSerialNumber() {
		return serialNumber;
	}

	// product number count
	private static int counter;
	// Only execute 1 time when class call by JVM
	static {
		// Cannot use same class variable/method
		counter = 0;
		System.out.println("Start with counter: " + counter + "\n");
	}


	public static int getTotalCount() {
		return counter;
	}

	// Constructor
	public Count() {
		counter++;
		serialNumber = 1000+counter;
	}
}