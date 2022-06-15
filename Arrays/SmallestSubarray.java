package Arrays;

public class SmallestSubarray {

	 public static void sub(int []arr,int n,int k){
	        int i,j;
	       
	        int mn=Integer.MAX_VALUE;
	       
	        for(i=0;i<n;i++){
	            int sum=0;
	            for(j=i+1;j<n;j++){
	                sum+=arr[j];
	                if(sum>k)
	                mn = Math.min(mn,j-i);
	            }
	        }
	        System.out.println(mn);
	    }
		public static void main(String[] args) {
			int arr[] ={1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
			int x = arr.length;
			int k =280;
			sub(arr,x,k);
		}

}
