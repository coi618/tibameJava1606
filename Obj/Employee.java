// Filename: Employee.java
public class Employee {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	// Override the equals() extends from Object
	public boolean equals(Object obj) {
		// Still check addr, if same return true
		if(this == obj) 
			return true;
		// Use (Object class's) getClass() to check if belong same class
		if(obj!=null && getClass() == obj.getClass()) {
			if(obj instanceof Employee) {
				Employee e = (Employee) obj;
				// choose class's instances judge if obj are the same
				if(empno == e.empno && ename.equals(e.ename)) {
					return true;
				}
			}
		}
		return false;
	}

	//@override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
}