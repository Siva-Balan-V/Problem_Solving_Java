package Array;
public class Reverse_array_04 {

	public static void main(String[] args) {
		// TODO Reverse the elements of an array.
		int[] arr = Arr.input();
		System.out.println("Original Array : ");
		Arr.Print(arr);
		int size=arr.length;
		for (int i=0;i<size/2;i++) {//Reversing the elements of array
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println("Reversed Array : ");
		Arr.Print(arr);		
	}
}
