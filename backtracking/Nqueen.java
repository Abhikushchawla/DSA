package backtracking;

public class Nqueen {

	public boolean isSafe(int [][]arr, int row,int col) {
		
		int i,j;
//		checking for row on left side
		for(i=0;i<col;i++) {
			if(arr[row][i]==1)
				return false;
		}
		
//		checking for upper left diagonal
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(arr[i][j]==1)
				return false;
		}
		
//		checking for left down diagonal
		for(i=row,j=col;i<arr.length && j>=0;i++,j--) {
			if(arr[i][j]==1)
				return false;
		}
		
		return true;
	}
	
	
}
