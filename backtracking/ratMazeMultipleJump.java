package backtracking;

public class ratMazeMultipleJump {
	
	public boolean isSafe(int [][]arr, int x,int N, int y) {
		if(arr[x][y]!=0 && x>=0 && x<N && y>=0 && y<N)
			return true;
		return false;
	}
	
	public static boolean ratUtil(int [][]arr, int [][]sol,int min_dist,int dist,int i, int j,int N, int x, int y) {
		
//		if(i==N-1 && j== N-1 && arr[i][j]==1 && sol[i][j]==1)
//			return true;
		
		
		
		return false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
