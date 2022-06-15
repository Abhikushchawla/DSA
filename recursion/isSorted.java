package recursion;

public class isSorted {
	
	public static boolean checkit(int arr[],int n,int i) {
		
		if(i==n-2) {
			return true;
		}
		if(arr[i]>arr[i+1])
			return false;
		
		return checkit(arr,n,i+1);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,13,12,15,18};
		boolean x = checkit(arr,5,0);
		if(x) {
			System.out.println("Yes");
		}
		else
			System.out.println("false");
	}

}
