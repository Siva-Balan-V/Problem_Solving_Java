package Intermediate;
import java.util.Scanner;
public class Armstrong_01 {

	public static void main(String[] args) {
		// TODO Armstrong number checker
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number  : ");
		int n=in.nextInt();
		int temp=n;
		int check=n;
		int count=0;
		double sum=0;
		while (n>0) {
			n/=10;
			count++;
		}
		while (temp>0) {
			int digit=temp%10;
			sum+=Math.pow(digit,count);
			temp/=10;
		}
		if (check==sum)
			System.out.println(check+" is a Armstrong number.");
		else
			System.out.println(check+" is not a Armstrong number.");
		in.close();
	}
}
