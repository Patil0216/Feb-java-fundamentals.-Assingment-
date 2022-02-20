package Java.Fundamentals;

import java.util.Scanner;

public class Add_3_ASCII_print_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter letter :: ");
		char i = scan.next().charAt(0);
		int c = i + 3;
		char v=(char)c;
		System.out.println("Equivalent letter "+v);
		System.out.println(c);

	}

}
