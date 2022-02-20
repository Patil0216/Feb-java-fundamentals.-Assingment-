package Java.Fundamentals;

import java.util.Scanner;

public class Coverts_hrs_to_days_yrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of hours :: ");
		int hour = scan.nextInt();
	     int Day= hour/24;
		int yrs= hour/8760;
		System.out.println(Day+"\n "+ yrs);
		 
		
}}
