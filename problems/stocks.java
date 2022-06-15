package problems;

public class stocks {
	public static void Sell(int [] arr) {
		int i,j;
		int mx=Integer.MIN_VALUE;
		int n=arr.length;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[j]-arr[i]>mx) {
					mx=arr[j]-arr[i];
				}
					
			}
		}
		System.out.println(mx);
	}

	public static void main(String[] args) {
		int ar[]= {};
		Sell(ar);

	}
}

