package Array;
import java.util.Scanner;
//User defined Package to work with Array
// Concepts used in the file
// Method Overloading and Overriding
// User defined package and method usage
class Arr {
	public static void Print(int arr[]){
		
		System.out.print("{");
		int i=0;
		while (i<arr.length-1) {
			System.out.print(arr[i]+",");
			i++;
		}
		System.out.print(arr[i]+"}\n");
	}
	
	static int[] input(int size) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<size ; i++)
			arr[i]=in.nextInt();
		in.close();
		return arr;
	}
	
	static int[] input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of array : ");
		int size=in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<size ; i++)
			arr[i]=in.nextInt();
		in.close();
		return arr;
	}

}
