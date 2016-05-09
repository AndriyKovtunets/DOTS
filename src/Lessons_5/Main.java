package Lessons_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static int hours = 9;
	static int minutes = 0;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
		int numbOfLessons = in.nextInt();
		for (int i = 1; i <= numbOfLessons; i++){
			addMinutes(45);
			if (i == numbOfLessons) {
				break;
			}
			if ((i%2) == 0) {
				addMinutes(15);
			}
			else {
				addMinutes(5);
			}
		}
		out.print(hours);
		out.print(" ");
		out.print(minutes);
		in.close();
		out.close();
	}
	
	private static void addMinutes(int mins){
		minutes += mins;
		if (minutes >= 60){
			hours++;
			minutes = minutes%60;
		}
	}
	
}
