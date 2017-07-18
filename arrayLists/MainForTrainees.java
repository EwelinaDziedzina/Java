package arrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

import javax.rmi.CORBA.Tie;

public class MainForTrainees {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

		Trainees t1 = new Trainees("John Smith", "Dublin 2", LocalDate.of(1989, Month.JULY, 12));
		Trainees t1Copy = new Trainees ("John Smith", "Dublin 2", LocalDate.of(1989, Month.JULY, 12));
		Trainees t2 = new Trainees ("Pat Flynn", "Nass", LocalDate.of(2000, Month.APRIL, 20));
		Trainees t3 = new Trainees ("Mary Jones", "Newbridge", LocalDate.of(1999, 12, 12));
		Trainees t4 = new Trainees ("Ben Blunt", "Dublin 3", LocalDate.of(1992, 2, 15));
		Trainees t5 = new Trainees ("Anna Green", "Leixlip", LocalDate.of(2001, 4, 12));



		ArrayList <Trainees> traineesList = new ArrayList <>();
		traineesList.add(t1);
		traineesList.add(t2);
		traineesList.add(t3);
		traineesList.add(t4);
		traineesList.add(t5);
		traineesList.add(new Trainees ("Peter Pale", "Dublin 11", LocalDate.of(1990, Month.AUGUST, 15)));

		System.out.println(traineesList);

		System.out.println(traineesList.contains(t1Copy));

		traineesList.get(2).setAddress("Dublin 8");

		System.out.println(traineesList);

		System.out.print("Please enter a name: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		boolean isFound = false;
		int i = 0;
		for(; i < 6; i++){
			if(traineesList.get(i).getName().equals(input)){
				System.out.printf(traineesList.get(i).getName() + " was born " + traineesList.get(i).getBirthday().format(formatter));
				isFound = true;
			}
		}
		
		if (!isFound)	
			System.out.println("Name wasn't found");
	
			
		
		//System.out.println(traineesList);
	}
}


