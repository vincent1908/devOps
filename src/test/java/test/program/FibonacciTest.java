package test.program;

public class FibonacciTest {

	public static void main(String[] args) {

		int a = 0, b = 1, c, count=15;
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
