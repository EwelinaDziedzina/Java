package sheet3ControlFlow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num=0;
		int total = 0;
		int counter = 0;
		
		do {
			System.out.println("Please type an integer (-1 to exit): ");
			
			
			num = scanner.nextInt();
			if (num !=-1) {
				total = total + num;
				counter++;
			}
			
		} while (num != -1);
		
		System.out.println("The total is " + total);
		System.out.println("The average is " + (double)total/counter);
		
		scanner.close();
	}
}
