package sheet4Arrays;

public class Ex4ClassNames {

	public static void main(String[] args) {
		
		String [] firstName = {"John", "Peter", "Sandra", "Carol", "Fred", "Samantha"};
		String [] lastName = {"Smith", "Carrol", "Cohen", "Jones", "Flynn", "Cave"};
		
		for (int i = 0; i<firstName.length; i++)
			System.out.println(firstName[i] + " "+lastName[i]);
			System.out.println();
	
			System.out.println("**array fullName**");
			System.out.println();
		
		String [] fullName = new String[firstName.length];
		for (int i = 0; i<fullName.length; i++){
			fullName [i] = firstName[i] + " "+ lastName[i];
			System.out.println(fullName[i]);
		}
			
	}	

}
