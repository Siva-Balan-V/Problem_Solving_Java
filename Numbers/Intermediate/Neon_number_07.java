package Intermediate;
import java.util.Scanner;
public class Neon_number_07 {

	public static void main(String[] args) {
		// TODO Neon number Checker
		// A neon number is an integer where the sum of the digits of its square equals the original number
		//The only neon numbers are 0 (0^2=0), 1 (1^2=1), and 9 (9^2=81), (8+1=9))
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Integer : ");
		int n = in.nextInt();
		int chk=n;
		n*=n;// Square of n
		int sum=0;		
		while (n>0) {
			sum+=n%10;
			n/=10;
		}		
		if (chk==sum)
			System.out.println(chk+" is  a Neon number.");
		else
			System.out.println(chk+" is not a Neon number.");
		in.close();
	}
}
