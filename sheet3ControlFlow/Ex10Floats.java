package sheet3ControlFlow;

public class Ex10Floats {

	public static void main(String[] args) {
	
			float num1 = 10;
			float num2 = 10;
			float num3 = 17;
			
			Ex10Floats ex10 = new Ex10Floats();
			ex10.sameOrDifferent(num1, num2, num3);
	}

	public void sameOrDifferent(float a, float b, float c){
		if(a==b && b==c)
			System.out.println("All numbers are the same");
		else if (a !=b && b!=c && a !=c)
			System.out.println("All numbers are different");
		else 
			System.out.println("Two are the same");
	}
}
