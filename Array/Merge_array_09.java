package Array;
import java.util.Scanner;
public class Merge_array_09 {

	public static void main(String[] args) {
		// TODO Merge array 1 and array 2 in array 3
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array 1 : ");
		int size1 = in.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter the elements of array : ");
		for(int i=0 ; i<size1 ; i++) {
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter the size of array 2 : ");
		int size2 = in.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of array : ");
		for(int i=0 ; i<size1 ; i++) {
			arr2[i]=in.nextInt();
		}
		int[] arr3 = new int[size1+size2];
		for(int i=0;i<size1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=size1;i<(size1+size2);i++) {
			arr3[i]=arr2[i-size1];
		}
		System.out.println("Array after Merging : ");
		Arr.Print(arr3);
		in.close();
	}
}
