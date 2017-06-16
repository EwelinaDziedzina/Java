package Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter a sentence: ");
		
		String string = scanner.nextLine();
		
		//System.out.println(string);
		
		char [] letters = string.toCharArray();
		
		System.out.println("Your sentence in reverse is: ");
		
		for (int i = letters.length -1 ; i >=0 ; i--){ // --> ONE WAY
			System.out.print(letters[i]);
		}
		System.out.println();
		
		for(int i = letters.length -1 ; i >=0 ; i--) // --> THE OTHER WAY
			System.out.println(string.charAt(i));
		
		scanner.close();
		

	}
}
