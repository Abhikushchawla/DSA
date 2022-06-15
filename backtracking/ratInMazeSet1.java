package backtracking;

public class ratInMazeSet1 {

	public boolean isSafe(int [][]arr, int x, int y, int N) {
		if(arr[x][y] == 1 || x>=0 && x<N && y>=0 && y<N)
			return true;
		return false;
	}
	
	public  boolean ratUtil(int maze[][], int sol[][],int N, int x,int y) {
		if(x==N-1 && y== N-1 && maze[x][y]==1 && sol[x][y]==1)
			return true;
		
		if (isSafe(maze, x, y,N) == true) {
            // Check if the current block is already part of solution path.   
            if (sol[x][y] == 1)
                return false;
         
          // mark x, y as part of solution path
          sol[x][y] = 1;

          /* Move forward in x direction */
          if (ratUtil(maze, sol, N,x + 1, y))
              return true;

          
          if (ratUtil(maze, sol,N, x, y + 1))
              return true;

          
          sol[x][y] = 0;
          return false;
      }

      return false;
  }
	
	public static void printSol(int sol[][], int N) {
		for(int x=0; x<N;x++) {
			for(int y=0;y<N;y++) {
				 System.out.print(
		                    " " + sol[x][y] + " ");
		           
			}
			 System.out.println();
		}
	}
	
	public static void main(String []args) {
		 int maze[][] = { { 1, 0, 0, 0 },
                 { 1, 1, 0, 1 },
                 { 0, 1, 0, 0 },
                 { 1, 1, 1, 1 } };
		 int n = maze.length;
		 printSol(maze,n);
		 
	}
}
