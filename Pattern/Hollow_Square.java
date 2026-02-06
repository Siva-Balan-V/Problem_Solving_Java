package Pattern;
import java.util.Scanner;
public class Hollow_square {

	public static void main(String[] args) {
		// TODO input =5
		// *****
		// *   *
		// *   *
		// *   *
		// *****
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of charecters : ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<n-2;i++) {
			System.out.print("*");
			for(int j=0;j<n-2;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		in.close();
	}

}
