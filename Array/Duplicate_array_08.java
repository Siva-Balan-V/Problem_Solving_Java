package Array;
import java.util.Scanner;
public class Duplicate_array_08 {

	public static void main(String[] args) {
		// TODO find the duplicate elements in array
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=in.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in array : ");
		for (int i=0; i <size; i++) {
			arr[i]=in.nextInt();
		}
		int[] dup=new int[size];
		int temp=0;
		System.out.print("\nDuplicate Elements in array : ");
		for(int i=0;i<size;i++) {
			for (int j=i+1;j<size;j++) {
				if(arr[i]==arr[j] & chk(dup,arr[j])) {
					dup[temp]=arr[j];
					temp++;
					System.out.print(arr[j]+",");
				}
			}
		}
		in.close();		
	}
	
	static boolean chk(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==x)
				return false;
		}
		return true;
	}
}
