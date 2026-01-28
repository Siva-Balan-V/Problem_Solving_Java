package PST;
import java.util.Scanner;

public class number_checker {

	public static void main(String[] args) {
		// TODO Positive_Negative
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Integer : ");
		int n = input.nextInt();
		if (n>0) {
			System.out.print("Positive");
		}
		else if (n<0) {
			System.out.print("Negative");
		}
		else {
			System.out.print(0);
		}
		input.close();
		
	}
	

}
