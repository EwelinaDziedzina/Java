package TwoDimentionalArrays;

public class Ex1FootballTeam {

	public static void main(String[] args) {
	
		//String [][] teams = new String[3][]; 
		String [][] teams = {{"Team 1", "Joe", "Fred", "Josh"}, {"Team 2", "Carol", "Agnes", "Philiph", "Tom"},
				            {"Team 3", "Nick", "Leonard", "Scott", "Brian"}};
		
		for(int i= 0; i<teams.length; i++){
			for(int j= 0; j <teams[i].length; j++){
				System.out.printf(teams [i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
