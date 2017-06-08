package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile {
	
	

		public static void main(String[] args) {
			
			String filename = "src/Thursday.txt";
			
			try {
				PrintWriter pw = new PrintWriter(filename);
				// We only want to write to the file when the previous line
				// is successful. If the previous line isn't successful,
				// execution will jump to the catch.
				pw.println("Hello");
				pw.println("It's Thursday");
				pw.flush();
				pw.close();
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "File could not be created");
				e.printStackTrace();
			}
			
			try{
				FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
				System.out.println(br.readLine());
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "File not found");
				e.printStackTrace();	
			}catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Error reding form the file");
				e.printStackTrace();
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Something else happend");
				e.printStackTrace();	
			}
			
			// The following line will execute whether an exception occurs
			// or not.
			System.out.println("End of main");

		}
	}



