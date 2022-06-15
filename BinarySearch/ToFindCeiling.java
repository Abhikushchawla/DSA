package BinarySearch;

public class ToFindCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {2,3,5,9,14,16,18};
		int ans =cieling(array,7);
		System.out.println(ans);
	}

	static int cieling(int arr[], int target) {
		
		int ciel=-1;
		int low=0;
		int high =arr.length-1;
		while(low<high) {
			int mid =(low+high)/2;
			if(arr[mid]<target)
				low=mid+1;
			else if(arr[mid]>target) {
				ciel=arr[mid];
				high=mid-1;
			}
			else
				ciel=arr[mid];
			
		}
		return ciel;
	}
	
}
