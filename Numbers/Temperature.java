package PST;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Celsius to Fahrenheit
		float c,f;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Temperature in Celsius : ");
		c=input.nextFloat();
		f=(9/5)*c+32;
		System.out.println("Fahrenheit : "+f);
		input.close();
	}

}
