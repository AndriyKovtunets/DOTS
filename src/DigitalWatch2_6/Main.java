package DigitalWatch2_6;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException  {
	
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
	
		int a = in.nextInt();

		int seconds, minutes, hours;
		
		seconds = a%60; 
		minutes = (a-seconds)/60 %60;
		hours = (a-seconds-minutes*60)/3600%60%24;
		
		out.printf("%02d:%02d:%02d",hours,minutes,seconds);
		
		in.close();
		out.close();

	}

}
