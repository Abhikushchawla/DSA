package BinarySearch;

import java.util.Scanner;

public class FirstandLastPosition {

	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n;
		int i;
		n=s.nextInt();
		int array[]= new int[n];
		for(i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		int tar = s.nextInt();
		
	  System.out.println("First Occurrence = " +
	                      first(array, tar, n));
	  System.out.println("Last Occurrence = " +
	                      last(array, tar, n));
	}
	
//	
	static int first(int arr[],
            int x, int n)
{
int low = 0, high = n - 1,
 res = -1;
while (low <= high)
{
// Normal Binary Search Logic
int mid = (low + high) / 2;

//int mid = low + (high – low)/2;
// use this to find middle bcz 
//mid = (low + high) / 2 this fails for larger values of int variables low and high. 
//Specifically, it fails if the sum of low and high is greater than the maximum positive int value(231 – 1 ).

if (arr[mid] > x)
 high = mid - 1;
else if (arr[mid] < x)
 low = mid + 1;


else
{
 res = mid;
 high = mid - 1;
}
}
return res;
	}

	
	static int last(int arr[], int x, int n)
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
	 
	    // If arr[mid] is same as x,
	    // we update res and move to
	    // the right half.
	    else
	    {
	      res = mid;
	      low = mid + 1;
	    }
	  }
	  return res;
	}
	
}
