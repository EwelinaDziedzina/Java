package Strings;

import java.util.Scanner;

public class ComparingWords {

	public static void main(String[] args) {
		
		System.out.print("Please enter first word: ");
		Scanner scanner = new Scanner (System.in); 
		String word1 = scanner.nextLine();
		System.out.print("Please enter a second word: ");
		String word2 = scanner.nextLine();
		scanner.close();
		
		if (word1.compareTo(word2)>0){
			System.out.println(word1 + " follows " + word2);
		}else{
			System.out.println(word1 + " precedes " + word2);	
		}
	}
}
		