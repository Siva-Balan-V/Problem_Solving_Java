package PST;
import java.util.Scanner;
public class Circle_area {

	public static void main(String[] args) {
		// TODO Area of a circle
		Scanner input = new Scanner(System.in);
		double r,area;
		System.out.println("Enter the Radius of the Circle : ");
		r=input.nextFloat();
		area=r*r*3.14;
		System.out.println("Area of the Circle :"+area+" Sq.units");
		input.close();
	}

}
