package problems;

public class KadansAlgorithm {

	public static void main(String[] args) {
		int []array = {1,2,3,-2,5};
		int ans =maxSubarraySum(array,5);
System.out.println(ans);
	}
	
static int maxSubarraySum(int arr[], int n){
        
        int mx =Integer.MIN_VALUE;
        int x =0;
        int i;
        for(i=0;i<n;i++){
            x = x + arr[i];
             x = Math.max(x,arr[i]);
            mx = Math.max(mx,x);
           
        }
        return mx;
        
    }

}
