package PST;
import java.util.Scanner;
public class Largest_element_array {

	public static void main(String[] args) {
		// TODO To count the number of odd elements and even elements
		int size,largest;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		largest=arr[0];
		for(int i=0;i<size;i++) {
			if (largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element in array : " + largest);
		in.close();
	}

}
