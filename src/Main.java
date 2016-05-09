
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) throws FileNotFoundException  {
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));

		int a = in.nextInt();

		out.printf("The next number for %d is %d.\n", a, a + 1);
		out.printf("The previous number for %d is %d.\n", a, a - 1);

		in.close();
		out.close();
		
	}	
}
