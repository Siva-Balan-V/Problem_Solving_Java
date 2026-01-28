package PST;
import java.util.Scanner;
public class Number_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Whole Number : ");
		int num=in.nextInt();
		int temp=num;
		int rev=0;
		while (num>0) {
			rev=(rev*10)+(num%10);
			num/=10;
		}
		if (rev==temp) {
			System.out.println(rev+" is a Palindrome.");
		}
		else {
			System.out.println(temp+" is not a Palindrome.");
		}
		in.close();
	}

}
