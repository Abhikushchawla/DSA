package sorting;

public class bubbleSort {
	
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void sort(int arr[],int n) {
		int i;
		int j;
		for(i=0;i<n;i++) {
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
					
			}
		}
	}

	public static void main(String[] args) {
		
		int array[] = {7,8,3,1,2};
		sort(array,5);
		print(array);
		
//time complexity O(n^2)
//best case complexity O(n)		
	}

}
