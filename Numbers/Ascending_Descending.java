package PST;
import java.util.Scanner;

public class Ascending_Descending {

	public static void main(String[] args) {
		// TODO to print the array in both ascending and descending order
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=in.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in array : ");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nDescending Order : ");
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		in.close();
	}

}
