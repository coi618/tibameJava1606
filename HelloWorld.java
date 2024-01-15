// HelloWorld.java

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		/**********************************
		int i = 1, j = 0;
		System.out.println("1+0="+i+j);

		i = 1;
		j = 0;
		System.out.println(i+j+"=1+0");

		int a = 8;
		int sum = 6;
		sum =+ a*2;
		System.out.println(sum);
		
		int x = 1;
		double y = 2.2;
		y = x+1;
		x = (int)y+1;
		System.out.println(x+" "+y); // 3 2.0
		**********************************/

		int x[] = new int[3];
		x[0]=1;
		int y[]={1,2,3};
		System.out.println(y[0]);
		int [] a, b;
		//a[0]=1; a[1]=2;
		a = new int[3];
		a = {4,5,6};
		System.out.println(a[0]+" "+a[1]);
	}
}