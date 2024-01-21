// Filename: Test.java

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(7001, "King");

		System.out.println(e1); // println help transfer to toString()
		// Readable after override
		// Employee [empno=7001, ename=King] 
		System.out.println(e1.toString()); // Employee@7ad041f3
		/* Check source code
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}
		*/
	}
}