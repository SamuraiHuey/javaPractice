package javaPractice;
import java.util.Scanner;

public class Excercise13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Lets find the area and perimeter of a rectangle -" );
		System.out.print("Width: ");
		double w = in.nextDouble();
		System.out.print("Height: ");
		double h = in.nextDouble();
		
		System.out.println("Area: " + w * h);
		System.out.println("Perimeter: " + 2 * (h + w));
		
	}
}
