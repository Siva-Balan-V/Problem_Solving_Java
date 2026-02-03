package Intermediate;
import java.util.Scanner;
public class Kaprekar_number_08 {

	public static void main(String[] args) {
		// Kaprekar number checker
		// A Kaprekar number is a positive integer whose square, when split into two parts (right part containing non-zero digits), sums back to the original number
		// (e.g., (45^2=2025), (20+25=45)).
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number  : ");
		int n=in.nextInt();
		int sum=0,count=0;
		int sq_n=n*n;	
		boolean chk=false;
		while (sq_n>0) {
			if (n==1) {
				chk=true;
				break;
			}
			count++;//counting the number of digits in sq number.
			sq_n/=10;
		}		
		sq_n=n*n;//re initiating sq value
		for(int left=1;left<count;left++) {
			
			int temp=(int)Math.pow(10,count-left);
			int r=sq_n%temp;
			int l=(sq_n-r)/temp;
			sum=r+l;
			if (sum==n) {
				chk=true;
				break;
			}
		}
		if (chk==true)
			System.out.println(n+" is a Kaprekar number.");
		else
			System.out.println(n+" is not a Kaprekar number.");
		in.close();

	}

}
