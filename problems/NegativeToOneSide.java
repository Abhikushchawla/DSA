package problems;

public class NegativeToOneSide {

	public static void main(String[] args) {
		int [] array = {1 ,-1, 3, 2, -7, -5, 11, 6};

segregateElements(array,8);

	}
	 static void segregateElements(int arr[], int n)
	    {
	        int []temp = new int[n];
	        int j=0;
	        
	        for(int i=0;i<n;i++){
	           if( arr[i]>=0)
	           temp[j++]=arr[i];
	        }
	        if (j == n || j == 0){
	            return;
	        }
	            for(int i=0;i<n;i++){
	                if(arr[i]<0)
	                temp[j++]=arr[i];
	        }
	            
	           for(int k=0;k<n;k++){
	               System.out.print(temp[k] + " ");
	           }
	}

}
