
package sorting;

public class insertionSort {
	
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int arr[], int n) {
		int i,j;
		for(i=1;i<n;i++) {
			int key =arr[i];
			j=i-1;
			while(j>=0 && key<arr[j] ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		
		int array[] = {7,8,3,1,2};
		sort(array,5);
		print(array);
		

	}

}

