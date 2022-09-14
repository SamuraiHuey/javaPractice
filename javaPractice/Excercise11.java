package javaPractice;
import java.util.Scanner;

public class Excercise11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the Radius of the Circle:");
		double r = in.nextDouble();
		
		System.out.println("Perimeter: " + 2 * Math.PI * r);
		System.out.println("Area: " + Math.PI * (r * r));
		
	}
}
