package recursion;

public class sayDisits {

	public static void say(int n, String arr[]) {
		if(n==0)
			return;
		
	 int digit = n%10;
	  n=n/10;
	  say(n,arr);
	  System.out.print(arr[digit]+" ");
	  //try to print "n" also
		
	}
	
	public static void main(String args[]) {
		String arr[] = {"zero","one","two","three","four","five",
				"six","seven","eight","nine"};
		say(443,arr);
		
	}
	
}
