package Strings;

public class Equals {

	public static void main(String[] args) {
		
		String strA = new String ("Monday");
		String strB = new String ("Monday");
		String strC = "Tuesday";
		String strD = "Tuesday";
		String strE = new String ("Tuesday");
		
		System.out.println("strA == strB: " + (strA == strB));
		System.out.println("strD == strC: " + (strD == strC));
		System.out.println("strD.equals(strC): " + strD.equals(strC));
		System.out.println("strA.equals(strB): " + strA.equals(strB));
		System.out.println("strD == strE: " + (strD == strE));
		System.out.println("strD == strC.toUpperCase(): " + (strD == strC.toUpperCase()));	
	}
}
