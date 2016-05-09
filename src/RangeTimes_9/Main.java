package RangeTimes_9;



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

		seconds = seconds + minutes*60 + hours*3600;
		seconds2 = seconds2 + minutes2*60 + hours2*3600;
		
		int rezult =Math.abs(seconds2 - seconds);
		out.printf("%d", rezult);
		
		in.close();
		out.close();

	}

}
