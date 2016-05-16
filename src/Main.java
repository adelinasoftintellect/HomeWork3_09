
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter five different numbers to find largest of them");

		System.out.println("Please, enter number a ;");
		int a = input.nextInt();

		System.out.println("Please, enter number b ;");
		int b = input.nextInt();

		System.out.println("Please, enter number c ;");
		int c = input.nextInt();

		System.out.println("Please, enter number d ;");
		int d = input.nextInt();

		System.out.println("Please, enter number e ;");
		int e = input.nextInt();

		if (a > b && a > c && a > d && a > e) {
			System.out.println("The bigger number is: " + a);

		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("The bigger number is: " + b);

		}

		else if (c > a && c > b && c > d && c > e) {
			System.out.println("The bigger number is: " + c);

		}

		else if (d > a && d > b && d > c && d > e) {
			System.out.println("The bigger number is: " + d);

		}

		else if (e > a && e > b && e > c && e > d) {
			System.out.println("The bigger number is: " + e);
		} 
		else {
			System.out.println("Entered numbers are not distinct.");
		}

		input.close();

	}
}
