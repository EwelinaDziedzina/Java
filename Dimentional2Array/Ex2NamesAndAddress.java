package Dimentional2Array;

import java.util.Scanner;

public class Ex2NamesAndAddress {

	public static void main(String[] args) {
		String [][] data ={ {"Joe Murphy", "12 Main Street", "Finglas", "Dublin 11"},
				{"Mary Jones", "36 Amiens Street", "Dublin 1"}, {"Pat O'Connor", "26 South Main Street",
					"Wexford", "Co. Wexford"} };
		
		for(int i = 0; i<data.length; i++){
			for (int j = 0; j <data[i].length; j++){
				System.out.print(data[i][j]+", ");	
			}
			System.out.println();
		}
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name to see address:");
		String name = scanner.nextLine();
		scanner.close();
		
		for(int i= 0; i<data.length; i++){
			for (int j = 1; j<data[i].length; j++){
				if (data[i][0].equals(name))// data[i][0].equalsIgnoreCase(name)) mateda ignorujaca wielkie litery
					System.out.println(data[i][j]);
				
			}
		}
	}

}
