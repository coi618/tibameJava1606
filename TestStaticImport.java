// Filename: TestStaticImport.java

package xxx;

import static java.lang.System.out;
import static java.lang.Math.PI;

public class TestStaticImport {
	public static void main(String[] args) {
		// Can ignore System.
		out.println("Looks a little violation...");
		out.println(PI);
	} 
}