package Dimentional2Array;

public class Ex3Clock {

	public static void main(String[] args) {
		//int time [][] = {00,01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}


		for (int i = 0; i <25; i++){
			for (int j = 0; j<=59; j++){
				for (int k=0; k<=59; k++)	
				System.out.printf("%02d:%02d:%02d\n", i, j, k);
			
			}	
		}	
	}
}
