package sorting;

public class insertionSort {
	
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int arr[], int n) {
		int i,j;
		
		for(i=0;i<n;i++) {
			int min =i;
			for(j=i+1;j<n;j++) {
				if(arr[min]>arr[j] ){
					
					min =j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		sort(arr,5);
		print(arr);
	}

}

