package Strings;

public class MenuStringBuilders {

	public static void main(String[] args) {
		
		
		StringBuilder todayMenu = new StringBuilder ("Wednesday's Menu: Roast turkey with homemade turkey gravy,"
				+ " potatoes and veg of the day.");
		
		todayMenu.replace(0, 6, "Thurs");
		System.out.println(todayMenu);
		
		todayMenu = new StringBuilder (todayMenu.toString().replaceAll("turkey", "beef"));
		System.out.println(todayMenu);
		
		todayMenu.append(" Jelly and ice cream for dessert.");
		System.out.println(todayMenu);
		
		todayMenu = new StringBuilder (todayMenu.toString().replaceAll(" and ice cream", ""));
		System.out.println(todayMenu);
		

	}

}
