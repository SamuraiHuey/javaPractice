package javaPractice;
import java.util.Scanner;

public class Excercise18 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		String x= in.next();
		System.out.println("Enter the second number: ");
		String z= in.next();
		int num1=Integer.parseInt(x,2);
		int num2=Integer.parseInt(z,2);
		int num3= num1*num2;

		System.out.println("Add is = "+ Integer.toBinaryString(num3));
	}
}
