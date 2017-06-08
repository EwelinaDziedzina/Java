package TraineesAndApprentices;

import java.time.LocalDate; ;

public class MainForTrainee {

	public static void main(String[] args) {
		
		
		Carpenter c1 = new Carpenter("John Smith", LocalDate.of(1978,3, 15),"GF125789654", "Carpets", 	Electrician.PHASE_DWO);
		System.out.println(c1);
		
		ComputerAidedDesign cad1 = new ComputerAidedDesign("Kevin Drake", LocalDate.of(1985, 10, 3), "JT8966324785"); 
		System.out.println(cad1);
		
		Electrician e1 = new Electrician ("James Flynn", LocalDate.of(1979, 6, 7),"GH569822140", "Toshiba", Electrician.PHASE_DWO);
		System.out.println(e1);
		
		SoftwareDeveloper sw1 = new SoftwareDeveloper("Stephen Green", LocalDate.of(1990, 12, 25), "GT589025479");
		System.out.println(sw1);
		
		Trainee [] allTrainees = {c1, cad1, e1, sw1};
		
		System.out.println("***ALL TRAINEES ARRAY***");
		
		for(Trainee trainee : allTrainees)
			System.out.println(trainee.toString());

		System.out.println("\n**************APPRENTICES 2 PHASE*************");
		for (Trainee trainee : allTrainees)
			if (trainee instanceof Apprentice && (((Apprentice)trainee).getPhase() == 2))
				System.out.println("\nApprentice name: " + trainee.getName() +
							"\nEmployers name: " +((Apprentice)trainee).getEmployersName());
	}
}
