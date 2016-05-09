package Watches_10;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));

		int hours = in.nextInt();
		int minutes = in.nextInt();
		int seconds = in.nextInt();
		int hours2 = in.nextInt();
		int minutes2 = in.nextInt();
		int seconds2 = in.nextInt();

		int rezultSeconds = (seconds + seconds2) % 60;
		int rezultMinutes = (minutes + minutes2 + (seconds + seconds2) / 60) % 60;
		int rezultHours = (hours + hours2 + (minutes + minutes2) / 60 + (seconds + seconds2) / 60) % 24;
	
		out.printf("%d %d %d", rezultHours, rezultMinutes, rezultSeconds);

		in.close();
		out.close();

	}

}