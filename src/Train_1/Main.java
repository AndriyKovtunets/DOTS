package Train_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) throws FileNotFoundException  {
		/*Enske road problem solution*/
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));

		int roadLength = in.nextInt();
		int stationQuantity = in.nextInt();
		int trainSpeed = in.nextInt();
		int travelTime = in.nextInt();
		/*start calculation after data reception*/
		int distanceTraveled = trainSpeed * travelTime;
		int relevantDistance = distanceTraveled % roadLength;
		int distBetweenStations = roadLength/stationQuantity;
		int currentStation = relevantDistance/distBetweenStations;
		currentStation += 1;
		
		out.write(Integer.toString(currentStation));
		in.close();
		out.close();
	}	
}
