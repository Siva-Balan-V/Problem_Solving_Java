package Array;
import java.util.Scanner;
public class Ascending_Array_07 {

	public static void main(String[] args) {
		// TODO Ascending order reordering
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=in.nextInt();
		System.out.println("Enter the elements of array : ");
		int[] arr = new int[size];
		for (int j=0;j<size;j++) {
			arr[j]=in.nextInt();
		}
		System.out.println("Array before Sorting :");
		Arr.Print(arr);
		arr=sort(arr,size);
		System.out.println("Array after Sorting : ");
		Arr.Print(arr);
		in.close();
	}
	public static int[] sort(int arr[], int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	

}
