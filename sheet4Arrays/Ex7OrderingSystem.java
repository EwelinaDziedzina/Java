package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex7OrderingSystem {
	
	public static void main (String [] args){
		
		int [] numRef = {1000, 1001, 1002, 1003, 1004};
		String [] productNames = {"Keyboard", "Mouse", "Monitor", "Mouse mat", "Speakers"};
		double [] prices = {49.99, 15.50, 124.99, 3.99, 23.50};
		
		System.out.println("Reference Number\tProduct Name\t\tPrice");
		System.out.println("----------------\t-----------\t\t------");
		for(int i=0; i<numRef.length; i++){
			System.out.printf("%-20d%-25s%.2f\n",numRef[i], productNames[i], prices[i]);
			
			//String input = JOptionPane.showInputDialog("Please enter a reference number");
			
			//(input== numRef [i]){
				//JOptionPane.showMessageDialog();
			//}
		}
	}	
}
