// Filename: Manager.java
public class Manager extends FullTimeEmployee {
	private double bonus; 

	public void display() {
		super.display();
		System.out.println("Bonus = "+bonus);
	}

	public Manager(int empno, String ename, double monthlySalary, double bonus) {
		// Why type this line?
		super(empno, ename, monthlySalary);
		this.bonus = bonus;

	}

	// New method override
	public double getSalary() {
		double monthlySalary = super.getSalary();
		return monthlySalary+bonus;
	}
}
