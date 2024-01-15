// filename: TestCount.java

// package xxx;

public class TestCount {

	public static void main(String[] args) {

		// user Count. to call static Method
		//System.out.println("Start up number: "+Count.getTotalCount()+"\n");

		Count count1 = new Count();
		System.out.println("Number of count: "+Count.getTotalCount());
		// Use Obj. to call object method
		System.out.println("SN: "+count1.getSerialNumber()+"\n");

		Count count2 = new Count();
		System.out.println("Number of count: "+Count.getTotalCount());
		System.out.println("SN: "+count2.getSerialNumber()+"\n");

	}
}