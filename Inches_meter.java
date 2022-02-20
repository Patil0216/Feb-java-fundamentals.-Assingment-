package Java.Fundamentals;
import java.util.Scanner;

public class Inches_meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere the number :: ");
		int inch=scan.nextInt();
		double meter= inch*0.0254;
		System.out.println(meter);

	}

}
