package PST;
import java.util.Scanner;

public class Arithmetic_operators {

	public static void main(String[] args) {
		// TODO +-/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int sum=n1+n2;
		int dif=n1-n2;
		int pro=n1*n2;
		int qu= n1/n2;
		System.out.println("Sum : "+ sum);
		System.out.println("Difference : "+ dif);
		System.out.println("Product : "+ pro);
		System.out.println("Quotient : "+ qu);
		input.close();
	}

}
