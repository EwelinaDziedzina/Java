package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOfStrings {

	public static void main(String[] args) {

		ArrayList <String> namesList = new ArrayList<>();
		String [] namesStrArray = {"Damien", "Asen", "Ewelina", "James", "Janos", "Ben", "Sean", "Kevin", "Shon", "Jay", "Pat", 
				"Darius", "Luca", "Vitali", "Emmanuel", "Stephen", "Agnieszka", "Gabriela"};
 //a)		
		namesList.addAll(Arrays.asList(namesStrArray));
		System.out.println(namesList);
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a name: ");
		String name = scanner.nextLine();
 //b)	
		if (namesList.contains(name)){
			System.out.println(name + " is found at position " + (namesList.indexOf(name) + 1));
		}else{
			System.out.println("Name " + name + " was not found.");
		}
//c)	
		System.out.print("Enter a name you want to delete ");
		String deleteName = scanner.nextLine();
		
		if (namesList.remove(deleteName)==true){
		System.out.println("Name " + deleteName + " was succesfully deleted ");
		}else{ 
		System.out.println("Name " + deleteName + " is not on the list. ");	
		}
		System.out.println(namesList);
 //d)	
	
		System.out.print("Enter the name you want to change ");
		String changeName = scanner.nextLine();
		if(namesList.contains(changeName)){
		System.out.print("Enter the name you want change " + changeName + " for ");
		String changeForName = scanner.nextLine();
		namesList.add(namesList.indexOf(changeName), changeForName);
		namesList.remove(changeName);
		}
		else{
			System.out.println("Name " + changeName + " is not on the list");
		}
		
		
		System.out.println(namesList);
 //e)	
		System.out.println("There is " + namesList.size() + " names on the list." );
		
 //f)
		Collections.sort(namesList);
		System.out.println("Names sorted in alphabetically order:\n" + namesList);
		
 //g)	
		System.out.println("You're about to remove " + namesList.get(7));
		namesList.remove(namesList.get(7));
		
 //h)	
		namesList.add(0, "Santa");
		System.out.println(namesList);
		
 //i) 	
		System.out.println(namesList.isEmpty()? "List IS empty": "List ISN'T empty");
		
		namesList.clear();
		
		System.out.println(namesList.isEmpty()? "List IS empty": "List ISN'T empty");
		
	}

}
