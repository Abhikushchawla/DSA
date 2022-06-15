package recursion;

public class countWaysToReachNStairs {

	//we can reach to last stair either taking 1 step jump i.e. through (n-1)th stair or using 2 step jumps (n-1)th 
	
	public static int count(int n) {
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		return count(n-1)+count(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count(3));
	}

}

//in this question we have to find the number of distinct ways to reach the nth stair
