package Intermediate;
import java.util.Scanner;
public class Automorphic_number_04 {

	public static void main(String[] args) {
		// TODO Automorphic number checker
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Whole number : ");
		int n=in.nextInt();
		double root=Math.sqrt(n);
		int a=(int)root; //Converting to integer type
		int count=0;
		while (a>0) {
			a/=10;
			count++;//to find how many last digits to find
		}
		int p=1;
		for(int i=0;i<count;i++)
			p*=10;
		int rem=n%p;//retrieving the required last digit
		if (rem==(int)root)//to check last digit and remainder are same
			System.out.println(n+" is a Automorphic number.");
		else
			System.out.println(n+" is not a Automorphic number.");
		in.close();
	}
}
