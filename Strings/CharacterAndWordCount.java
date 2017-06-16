package Strings;

import java.util.Scanner;

public class CharacterAndWordCount {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter a sentence: ");
		Scanner scanner = new Scanner (System.in); 
		String sentence = scanner.nextLine();
		scanner.close();
		//char [] letters = sentence.toCharArray();
		String [] words = sentence.split(" ");
		System.out.println("Words: " + words.length);
		System.out.println("Characters (with spaces): " + sentence.length());
		
		
		int total = 0;
		for(int i = 0; i<words.length; i++){
			total = total + words[i].length();
			}
		
		System.out.println("Characters (without spaces): " + (total));
		
		/*if(sentence.charAt(sentence.length() - 1) == '.'){
		System.out.println("Characters (with spaces): " + (sentence.length()-1));
		System.out.println("Characters (without spaces): " + (total-1));
		}else{
		System.out.println("Characters (with spaces): " + sentence.length());
		System.out.println("Characters (without spaces): " + (total));
		}*/
	}
}

