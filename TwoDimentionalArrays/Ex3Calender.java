package TwoDimentionalArrays;




public class Ex3Calender 
{

	public static void main(String[] args)
	{
		String [] months = {"January", "February", "March", "April", "May", "June",
				"July", "August", "October", "November", "December"};
		char [] headings = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
		//int [] startingDay = {2, 5, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0};
		int startingDay = 6;
		int day = 0;


		int [][] days = 
			{ 
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
			};

		for(int i = 0; i<months.length; i++ ){
			System.out.println("\n\n "+months[i]);

			for(int j = 0; j<headings.length; j++){
				System.out.printf("%4s", headings[j]); //M T W T F S S
			}


			System.out.println(); // a new line after printing week day headings

			for (int k = 0; k<startingDay; k++){
				System.out.printf("%4s", " ");
			}	
			//for (int k = 0; k<startingDay.length; k++){
			//System.out.print(startingDay[k]+" ");


			day=startingDay ;
			for(int l = 0; l<days[i].length; l++){
					
				System.out.printf("%4d", days[i][l]);
			

				if (day==6){ //6 --counter starts from 0 (7 all together)
					System.out.println();
					day=0;
				}
				else
					day++;
			}
			startingDay = day;
		}
	}
}	



