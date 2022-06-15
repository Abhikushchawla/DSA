package Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int []arr= {1, 2, 3, 0, 1 };
		 Find(arr,5);
		

	}
	static void Find(int []nums,int n) {
		int i;
		int duplicate=-1;
		int j;
		for(i=0;i<n;i++) {
			j=Math.abs(nums[i]);
			if(nums[j]>=0)
				nums[j] = -nums[j];
			else {
				duplicate = j;
			}
		}
		
		System.out.print (duplicate);
	}

}
