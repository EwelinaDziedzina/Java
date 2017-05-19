package sheet4Arrays;

public class Ex6ExamResults {

	public static void main(String[] args) {
		
		int [] result1 = {50, 60, 75};
		int [] result2 = {39, 75, 41};
		int [] result3 = {45, 40, 33};
		
		Ex6ExamResults ex6 = new Ex6ExamResults();
		
		String result = ex6.calculateResult(result1)?"Pass":"Fail"; 
		//ex6.calculateResult(result1);
		System.out.println("Results 1: " + "\t" + result1[0]+ "\t" + result1[1] + "\t" + result1[2] +"\t"+ result);
		// ex6.calculateResult(result2);
		result = ex6.calculateResult(result2)?"Pass":"Fail";
		System.out.println("Results 2: " + "\t" + result2[0]+ "\t" + result2[1] + "\t" + result2[2] +"\t"+ result);
		//ex6.calculateResult(result3);
		result = ex6.calculateResult(result3)?"Pass":"Fail";
		System.out.println("Results 3: " + "\t" + result3[0]+ "\t" + result3[1] + "\t" + result3[2] +"\t"+ result);
		
	}	
	
	public boolean calculateResult (int [] examResult)	{
		
		boolean passOrFail = true;
		double total = 0;
		double average = 0;
		
		for (int i = 0; i< examResult.length; i++){
			total = total + examResult[i];
		}
		


		average = total/examResult.length;
			if (average>=40){
				passOrFail = true;
				//System.out.println("Pass");
				}
			else
			{
				passOrFail = false;	
			    //System.out.println("Fail");	
			}	
			return passOrFail;
	}
		

}


