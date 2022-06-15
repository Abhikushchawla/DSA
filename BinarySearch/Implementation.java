package BinarySearch;

//import java.util.Scanner;

//Time complexity is O(log n)
//Space complexity is O(1)

public class Implementation {
	

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		 int n = scan.nextInt();
//			int target=scan.nextInt();
//			int array[]= new int[n];
//			int i;
//			for(i=0;i<n;i++) {
//				array[i] = scan.nextInt();
//			}

		int array[] = { 5, 8 ,14, 19, 21, 23, 29, 31, 32, 33};
			int ans = search(array,10, 23);
			System.out.println(ans);
		
	}

	 public static int search(int arr[], int n, int target) {
		
		
		n=arr.length-1;
		int low=0;
		int high=n;
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid]>target) {
				high=mid-1;
			}
				
			else if(arr[mid]<target) {
				low=mid+1;
			}
				
			else
			return mid;
		}
		
		return -1;
	}
}
