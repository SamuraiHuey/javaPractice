package javaPractice;
import java.util.Scanner;

public class Excercise7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number:");
		int num = in.nextInt();
		
		for (int i = 0; i < 10; i++) {
		System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
		}
	}
}
