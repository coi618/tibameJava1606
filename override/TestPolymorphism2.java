// filename: TestPolymorphism2.java
public class TestPolymorphism2 {
	public static void main(String[] args) {
		Employee [] e = new Employee[3]; // Declare employee array with 3 elements

		e[0] = new FullTimeEmployee(7002, "Peter", 40000.0);
		e[1] = new Manager(7003, "Merry", 50000.0, 10000.0);
		e[2] = new PartTimeEmployee(7004, "John", 1000.0, 8); 

		for(int i=0; i<e.length; i++) 
			System.out.println(e[i].getSalary());
	}	
}