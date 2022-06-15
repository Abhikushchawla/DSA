package recursion;

public class totalPathsToReachEndOfMatrix {
	
	public static int total(int n, int m,int i,int j) {
		
		if(i==n || j==m)
			return 0;
		
		if(i==n-1 || j==m-1) {
			return 1;
		}
		
		int downpaths= total(n,m,i+1,j);
		int rightpaths=total(n,m,i,j+1);
		return downpaths+rightpaths;
//		move down+move right
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
int m=3;
int totalPaths = total(n,m,0,0);
System.out.println(totalPaths);
	}

}
