package ClockSolver3_2;

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
		double hourHandAngle = hours * 30.0; // get input data
		hourHandAngle += ((double)minutes )/2.0;
		hourHandAngle += (double)seconds * (0.5/60.0);
		out.println(hourHandAngle);
		in.close();
		out.close();

	}

}
