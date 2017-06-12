package Strings;

import java.util.Scanner;

public class SearchForTheLetter {

	public static void main(String[] args) {
		
		System.out.println("Please enter a word: ");
		Scanner scanner = new Scanner (System.in);
		String word = scanner.nextLine();
		
		System.out.println("Please eneter a letter you want to search for: ");
		
		String letter = scanner.nextLine();
				
		char [] letters = word.toCharArray();
		
		boolean isFound = false;
		for(int i = 0; i<letters.length; i++){
			if(letters[i]==letter.charAt(0)){
				System.out.println(letter + " is on position " + (i+1));
				isFound = true;
			}
		}
		if (!isFound)
			System.out.println(letter + " was not found");
			
	}		
}			
			
		//int position = word.indexOf(letter);
	
			/*if (position != -1){
				System.out.println(letter + " is at position " + (position + 1));
			}
			if (position == -1){
				System.out.println(letter + " was not found");
			}	*/
	


