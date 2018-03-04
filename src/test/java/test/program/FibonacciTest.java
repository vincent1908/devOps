package test.program;

import org.testng.annotations.Test;

public class FibonacciTest {
@Test
	public static void main() {
// new count
		 a = 0, b = 1, c, count=10;
// gregory comment
		// riya comment

		System.out.print(a+" "+b+" ");
		
		for(int i = 2; i<count;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
