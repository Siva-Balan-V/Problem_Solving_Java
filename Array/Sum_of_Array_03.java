package Array;
import java.util.Scanner;
public class Sum_of_Array_03 {

	public static void main(String[] args) {
		// TODO To give the sum of the elements in array
		int size,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		size = in.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of elements in array : " + sum);
		in.close();
	}

}
	
