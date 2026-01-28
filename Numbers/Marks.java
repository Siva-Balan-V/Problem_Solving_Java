
package PST;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Sum and average of 3 marks
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 Marks: ");
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		int m3 = input.nextInt();
		int tot=m1+m2+m3;
		double avg =tot/3;
		System.out.println("Total Marks : "+tot);
		System.out.print("Average Mark : "+avg);
		input.close();
	}
}
