package Array;

import java.util.Scanner;

public class Second_Largest_Element_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=in.nextInt();
		System.out.println("Enter the elements in array :");
		int[] arr=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		in.close();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[size-2]+" is the second largest element in array.");
	}

}
