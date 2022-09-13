package javaPractice;
import java.util.Scanner;


public class Exercise6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number:");
		int a = in.nextInt();
		
		System.out.print("Input second number:");
		int b = in.nextInt();
	
	int first = a + b;
	int second = a - b;
	int third = a * b;
	int fourth = a / b;
	int fifth = a % b;
	
	System.out.println(first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
	}
}
