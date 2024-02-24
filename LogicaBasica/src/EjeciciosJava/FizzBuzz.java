package EjeciciosJava;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i=1;i<=100;i++) {
			
			boolean mult3 = i%3 == 0;
			boolean mult5 = i%5 == 0;
			
			if (mult3 && mult5) {
				System.out.println("fizzbuzz"+"\n");
			}else if (mult5 || mult3) {
				System.out.println("buzz"+"\n");
			}else if (mult3 || mult5) {
				System.out.println("fizz"+"\n");
			}else {
			    System.out.println(i+"\n");
			}
		}

	}

}
