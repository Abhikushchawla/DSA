package recursion;

public class arraySum {
	
	public static int sum(int arr[], int n) {
		if(n==0)
			return 0;
		if(n==1)
			return arr[0];
		
		return arr[n-1]+sum(arr,n-1);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {3,2,5,6,1};
int y = sum(arr,5);
System.out.println(y);
	}

}
//do the question to find weather the key element is present inside the array or not
//do another question binary search using recursion

