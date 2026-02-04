package Array;

public class Left_rotate_10 {

	public static void main(String[] args) {
		// TODO Left rotation of array 
		int[] arr=Arr.input();
		System.out.println("Array before Rotation : ");
		Arr.Print(arr);
		int e1=arr[0];
		for(int i=0 ; i<arr.length-1 ; i++) {
			arr[i]=arr[(i+1)];
		}
		arr[arr.length-1]=e1;
		Arr.Print(arr);
	}

}
