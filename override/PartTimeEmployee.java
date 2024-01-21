// filename: PartTimeEmployee.java
public class PartTimeEmployee extends Employee {
	private douuble hourPay; 
	private int workHour;

	public void display() {
		super.display();
		System.out.println("Hour Pay = "+hourPay);
		System.out.println("Work Hours = "+workHour);
	}

	public PartTimeEmployee(int empno, String ename, double hourPay, int workHour) {
		super(empno, ename);
		this.hourPay = hourPay;
		this.workHour = workHour;
	}

	// New method override
	public double getSalary() {
		return hourPay*workHour;
	}
}