// Filename: TestPolymorphism1.java
public class TestPolymorphism1 {
	public static void main(String[] args) {
		EmployeePoly e1 = new FullTimeEmployeePoly(7002, "Peter", 50000.0);
		EmployeePoly e2 = new ManagerPoly(7003, "Merry", 50000.0, 10000.0);
		EmployeePoly e3 = new PartTimeEmployeePoly(7004, "John", 1000.0, 8);

		// FullTimeEmployeePoly f = (FullTimeEmployeePoly)e1; // Type casting
		// ManagerPoly m = (ManagerPoly)e1; // java.lang.ClassCastException
		// PartTimeEmployeePoly p = (PartTimeEmployeePoly)e1; // java.lang.ClassCastException

		System.out.println("Casting success.");
	}

}