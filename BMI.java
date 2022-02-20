package Java.Fundamentals;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Weight :: ");
		double w = scan.nextInt();
		System.out.println("Enter Weight :: ");
		double h = scan.nextInt();
		double BMI = (w * 703) / (h * h);
		System.out.println(BMI);
	}
}
