package Java.Fundamentals;

import java.util.Scanner;

public class Tem_celsius_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temperature :: ");
		int Celsius = scan.nextInt();
		double Fahrenheit=9/5*Celsius+32;
		System.out.println(Fahrenheit);
	}

}
