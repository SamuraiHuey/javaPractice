package javaPractice;
import java.util.Scanner;

public class Excercise12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number: ");
		double a = in.nextDouble();
		System.out.println("Second number: ");
		double b = in.nextDouble();
		System.out.println("Third number: ");
		double c = in.nextDouble();
		
		System.out.print("Average: " + (a + b + c) / 3);
	}
}
