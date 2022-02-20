package Java.Fundamentals;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Marks :: ");
		int i=scan.nextInt();
		if (i > 400 && i <= 500) {
			System.out.println("A");
		} else if (i > 300 && i <= 400) {
			System.out.println("B");
		} else if (i > 200 && i <= 300) {
			System.out.println("C");

		} else if (i > 100 && i <= 200) {
			System.out.println("D");

		} else {
			System.out.println("Fail");

		}

	}

}
