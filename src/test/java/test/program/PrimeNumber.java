package test.program;

public class PrimeNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int num = 29;

		// 2 29/2 ++
		// num%i

		// System.out.println(29%1);

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
				break;
		}
		
		

	}

}
