package sheet4Arrays;



import java.util.Random;
import java.util.Scanner;


public class Ex1bSearchingAndSorting {


	public static void main(String[] args) {

		int [] array1 = new int [50]; 
		Random random = new Random();
		int i = 0;
		for(int value = (random.nextInt(100)+1); i<array1.length; i++, value = (random.nextInt(100)+1)){
			array1[i]= value;
			System.out.print(array1[i] + ", ");
		}
		System.out.println();
		Ex1bSearchingAndSorting ex1 = new Ex1bSearchingAndSorting();
		ex1.smallestValue(array1);
		ex1.largeestValue(array1);
		ex1.searchArray(array1);


	}

	public void smallestValue(int array1[]){      
		int smallest = array1 [0]; 
		for (int i = 0 ; i < array1.length ; i++){
			if(array1[i] < smallest)
				smallest = array1[i]; 
		}
		System.out.println("Smallest value is: " + smallest);

	}
	public void largeestValue(int array1[]){      

		int largest= array1[0];
		for (int i =0 ; i < array1.length ; i++){
			if (array1[i]>largest)
				largest=array1[i];
		}
		System.out.println("Largest value is: " + largest);
	}	
		//•	searchArray() – this method should take in the int array 
		//to search in and the value to search for. It should print out the 
		//first position the element was found at.
		
		
		
		
		Scanner scanner = new Scanner (System.in);
		
		public void searchArray(int array1[]){
		System.out.println("Please enter a value from 1 to 100: ");
		int num = scanner.nextInt();
		boolean  isFound= false;
		
		for(int i = 0; i<array1.length; i++){
			
			if (array1[i] == num){
				isFound=true;
				System.out.printf("Number %d was found at position %d.\n", num, i+1);
				break;
			}
		}	
			if (!isFound)
				System.out.printf("Number %d was not found in array.", num);		
	}
}




