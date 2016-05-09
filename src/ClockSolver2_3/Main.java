package ClockSolver2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
		int hours = 0;
		int minutes = 0;
		double hourHandAngle = in.nextDouble(); // get input data
		while (hourHandAngle >= 30.0) {
			hourHandAngle -= 30.0; 	// get relevant hand position
			hours++;				//and calculate hours quantity
		}
		minutes = (int)(hourHandAngle * 2);
		out.print(hours);
		out.print(" ");
		out.println(minutes);
		in.close();
		out.close();
	}

}
