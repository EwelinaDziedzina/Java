package sheet4Arrays;

public class Ex6ExamResults2 {


	public static void main(String [] args){

		int result1 [] = {50, 60, 75};
		int result2 [] = {39, 75, 15};
		int result3 [] = {45, 40, 33};
		int a = 1;
		Ex6ExamResults2 ex6 = new Ex6ExamResults2();
		ex6.printResult(result1, a); 
		ex6.printResult(result2, 2); 
		ex6.printResult(result3, 3); 
	}


	public void printResult(int [] results , int a){
		System.out.print("Results"+a+":\t");
		for (int i = 0; i<results.length; i++){
			System.out.print(results[i]+ "\t");
		}
		calculateResults(results);
	}

	public void calculateResults(int [] examResults){
		int sum = 0;
		int numOfPasses = 0;
		for (int i = 0; i<examResults.length; i++){

			if (examResults[i]>40)
				numOfPasses++;
			sum = sum + examResults [i];
		}
		if (numOfPasses==3)
			System.out.print("Pass");
		else if (numOfPasses==2){
			if(sum/3>=50)
				System.out.print("Pass");
			else 
				System.out.print("Failed");
		}
		else
			System.out.print("Failed");


		System.out.println();
	}
}
