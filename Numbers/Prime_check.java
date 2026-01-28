package PST;
import java.util.Scanner;
public class Prime_check {

	public static void main(String[] args) {
		// TODO Check whether given number is prime or not
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Natural number : ");
		int n = in.nextInt();
		int check=1;
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				check=0;
				break;
			}
		}
		if (check==1) {
			System.out.println(n+" is a Prime number.");
		}
		else {
			System.out.println(n+" is not a Prime number.");
		}
		in.close();
	}
}
