package Array;
import java.util.Scanner;

public class Largest_element_01 {

	public static void main(String[] args) {
		// TODO To find the largest element in array
		int size,largest;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		size = in.nextInt();
		int[] arr = Arr.input(size); // using user defined functions
		largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element in array : " + largest);
		in.close();
	}

}
