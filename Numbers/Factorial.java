package PST;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Factorial of a number
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Whole Number :");
		int n=in.nextInt();
		if (n<0) {
			System.out.println("Enter a Whole Number !!!");
		}
		else if (n==0) {
			System.out.println("Factorial : "+1);
		}
		else {
			int fact=1;
			for(int i=1; i<=n;i++) {
				fact*=i;
			}
			System.out.println("Factorial : "+fact);
		}
		in.close();
	}

}
