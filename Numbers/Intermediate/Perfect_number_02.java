package Intermediate;
import java.util.Scanner;
public class Perfect_number_02 {

	public static void main(String[] args) {
		// TODO Perfect number checker
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Whole number : ");
		int n = in.nextInt();
		int sum=0;
		for(int i=1; i<n;i++) {
			if (n%i==0)
				sum+=i;
		}
		if (sum==n)
			System.out.println(n+" is a Perfect number.");
		else
			System.out.println(n+" is not a Perfect number.");
		in.close();
	}

}
