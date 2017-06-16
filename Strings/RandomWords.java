package Strings;

import java.util.Scanner;

public class RandomWords {

	public static void main(String[] args) {

		String [] words = {"investigation", "independent", "plum", "sunflower", "bedroom", "highway"};

		Scanner scanner = new Scanner (System.in);

		boolean isFound = false;


		for( int i = (int)(Math.random()*6 ); i<words.length; ){
			
			System.out.println("Your word has " + words[i].length() + " letters.");

			System.out.println("Please guess a letter");
			String input = scanner.nextLine();
			char [] arreyOfLetter = words[i].toCharArray(); 
			
			scanner.close();

			for (int j = 0; j<words[i].length(); j++){   
				if (arreyOfLetter[j] == input.charAt(0)){
					System.out.println(input + " is on position " + (j+1));
					isFound = true;
				}
			}

			if (!isFound)
				System.out.println(input + " was not found");	

		}
	}
}





