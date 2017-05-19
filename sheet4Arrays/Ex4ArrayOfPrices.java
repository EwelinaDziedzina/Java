package sheet4Arrays;

public class Ex4ArrayOfPrices {

	public static void main(String [] args){
		
		double [] oldPrice = {12.5, 7.9, 1.99, 2.35, 17.50, 5.60, 2.30, 18.60, 20.60, 7.50, 40, 12};
		double [] newPrice = new double[oldPrice.length];
		
		for (int i=0; i<oldPrice.length; i++ )
			newPrice [i] = oldPrice[i] * 1.04;
		
		System.out.printf("%-12s%-12s\n", "Old Price", "New Price");
		for (int i = 0; i < oldPrice.length; i++){
			System.out.printf("%-12.2f%-12.2f\n", oldPrice[i], newPrice[i]);	
		}
		
	}
}
