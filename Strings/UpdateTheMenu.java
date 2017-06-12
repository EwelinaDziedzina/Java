package Strings;

public class UpdateTheMenu {

	public static void main(String[] args) {
		
		String string = "Wednesday's Menu: Roast turkey with homemade turkey gravy, potatos and veg of the day.";
		string = string.replace("Wednesday", "Thursday");
		
		System.out.println(string);
		
		string = string.replaceAll("turkey", "beef");
		
		System.out.println(string);
		
		String string2 = " Jelly and ice cream for dessert.";
		
		string = string.concat(string2);
		
		System.out.println(string);
		
		System.out.println(string.indexOf("Jelly"));
		System.out.println(string.indexOf("for"));
		
		
		
		string = string.substring(0 , 88) + string.substring(102);
		System.out.println(string);
		
	
		
		
		
		
		
		
	}
}
