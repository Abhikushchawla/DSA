package BinarySearch;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1};
		int ans =Peak(arr);
		System.out.println(ans);

	}

	static int Peak(int arr[]) {
		int low =0;
		int high=arr.length-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid]<arr[mid+1]) {
				low = mid+1;
			}
			else {
				high=mid;
			}
		}
//		low==high we tell that we got the largest element
//		as low and high are trying to find the largest element in the above code
		
		return low; //or return high as both are pointing to same index
	}
}
