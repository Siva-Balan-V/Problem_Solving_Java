package Intermediate;
import java.util.Scanner;
// The sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition.
// If the single digit comes out to be 1,then the number is a magic number. 
// eg:19 is Magic number (1+9=10, 1+0=1)
// 21 is not a Magic number (2+1=3)

public class Magic_number_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a natural number : ");
		int n,temp;
		n=in.nextInt();
		temp=n;
		int add=0;
		do {
			add=sum(n);
			n=add;
		}while(count(add)>1);
		
		
		if (add==1)
			System.out.println(temp+" is a magic number");
		else
			System.out.println(temp+" is not a magic number");
		in.close();
	}
	static int count(int x) {
		int count=0;
		while (x>0) {	
			count++;
			x/=10;
		}
		return count;
	}
	static int sum(int x) {
		int sum=0;
		while (x>0) {
			sum+=x%10;
			x/=10;
		}
		return sum;
	}
}
