package BinarySearch;

public class SortedRotatedArray {

	public static void main(String[] args) {
		
int arr[]= {4,5,6,7,0,1,2};

System.out.println(Final(arr,6));
	}
	
	static int Final(int array[], int target) {
		int low=0;
		int high = array.length-1;
		int n =array.length;
		int pi=findPivot(array);
		if(array[high]<target) {
			return BinarySearch(array,target,n,low,pi);
			
		}else {
			return BinarySearch(array,target,n,pi+1,high);
		}
		
	}

	static int BinarySearch(int arr[],
            int x, int n, int low, int high)
{

 int res = -1;
while (low <= high)
{
// Normal Binary Search Logic
int mid = (low + high) / 2;
if (arr[mid] > x)
 high = mid - 1;
else if (arr[mid] < x)
 low = mid + 1;


else
{
return mid;
}
}
return -1;

}
	

	static int findPivot(int arr[]) {
		int start =0;
		int end =arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			if(arr[mid]<=arr[start]) {
				end=mid-1;
			}else
				start=mid;
		}
		return -1;
	}
}
