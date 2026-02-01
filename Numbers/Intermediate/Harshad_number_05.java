package Intermediate;
import java.util.Scanner;
// A Harshad Number also called a Niven Number is a number that is exactly divisible by the sum of its digits.
public class Harshad_number_05 {
	static int Sum_of_digits(int n){
		int sum=0;
		while (n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO  Harshad number checker
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=in.nextInt();
		int check=Sum_of_digits(n);
		if (n%check==0)
			System.out.println(n+" is a Harshad number.");
		else
			System.out.println(n+" is not a Harshad number.");
		in.close();
	}

}
