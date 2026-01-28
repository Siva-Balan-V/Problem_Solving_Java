package PST;
import java.util.Scanner;
public class Sum_of_digits {

	public static void main(String[] args) {
		// Sum of digits of a number
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a whole number : ");
		int num=in.nextInt();
		int sum=0;
		while (num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println("Sum of digits : "+sum);
		in.close();
	}

}
