package javaPractice;
import java.util.Scanner;

public class Excercise15 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("First: ");
		a = in.nextInt();
		
		System.out.println("Second: ");
		b = in.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(" Swapped values are: " + a + " and " + b);
		
	}
}
