package BinarySearch;

public class TargetinInfiniteArray {

	public static void main(String[] args) {
		
		int arr[] =  {4,5,6,7,0,1,2};
		

	}
	
	static int first(int arr[],
            int x, int n)
{
int low = 0, high = n - 1,
 res = -1;
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
res=mid;
}
}
return res;

}
	static int search(int array[], int x) {
		int res =array[0];
		int low =0;
		
		int high=1;
		while(res<x) {
			low =high;
			if(2*high<array.length-1) {
				high=2*high;
				
			}
			else {
			high = array.length-1;
			
			}
			res = array[high];
		}
	return first(array,x,array.length-1);	
	
	}
}
