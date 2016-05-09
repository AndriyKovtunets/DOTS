package DiditalWatch1_7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException  {
		
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
	
		int a = in.nextInt();

		int minutes, hours;
		
		
		minutes = a %60;
		hours = (a-minutes)/60%24;
		
		out.printf("%d %d",hours,minutes);
		
		in.close();
		out.close();

	}

}
