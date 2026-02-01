package Intermediate;
import java.util.Scanner;
public class Strong_number_03 {

	public static void main(String[] args) {
		// TODO Strong number checker
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Whole number : ");
		int n = in.nextInt();
		int chk=n;
		int sum=0;
		while (n>0) {
			sum+=factorial(n%10);
			n/=10;
		}
		in.close();
		if (sum==n)
			System.out.println(chk+" is a Strong number.");
		else
			System.out.println(chk+" is not a Strong number.");
	}
	static int factorial(int x) {
		int fact=1;
		for(int i=0;i<=x;i++)
			fact*=i;
		return fact;
	}

}
