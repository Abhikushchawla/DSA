package backtracking;

public class Sudoku {
    
    static boolean isSafe(int [][] grid, int num , int row, int col){
        int i;
       
        int n = grid.length;
        for(i=0;i<n;i++){
            if(grid[row][i] == num)
            return false;
           
            if(grid[i][col] == num)
            return false;
            
            if(grid[3*(row/3) + i/3] [3*(col/3)+i%3] == num)
                return false;
        }
      
        
         return true;
    }
    
    static boolean solve( int grid[][]){

         int n = grid.length;
        
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==0){
                    for(int val=1;val<=9;val++){
                        if(isSafe( grid,val,row,col)){
                            grid[row][col] = val;
                            
                            boolean ageSolutionPossible = solve(grid);
                            
                            if(ageSolutionPossible)
                            return true;
                            else
                            grid[row][col]=0;
                        }
                    }
                                    return false;
                }

            }
        }
        return true;
    }
    
//	public static void solveSudoku(int[][] sudoku) {
//        // Write your code here.
//        solve(sudoku);
//	}
    
    public static void print(
            int[][] board, int N)
        {
             
            // We got the answer, just print it
            for (int r = 0; r < N; r++)
            {
                for (int d = 0; d < N; d++)
                {
                    System.out.print(board[r][d]);
                    System.out.print(" ");
                }
                System.out.print("\n");
     
                if ((r + 1) % (int)Math.sqrt(N) == 0)
                {
                    System.out.print("");
                }
            }
        }
    
    public static void main(String args[])
    {
 
        int[][] board = new int[][] {
            { 0, 5, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 0, 9, 0, 0, 6, 2 },
            { 0, 0, 0, 0, 6, 0, 5, 3, 8 },
            { 9, 0, 0, 0, 0, 1, 3, 4, 0 },
            { 0, 0, 0, 0, 0, 0, 7, 0, 0 },
            { 0, 3, 0, 2, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 5, 0, 8, 0 },
            { 5, 0, 0, 0, 0, 7, 0, 0, 0 },
            { 1, 0, 9, 6, 0, 0, 0, 0, 4 }
        };
        int N = board.length;
 
        if (solve(board))
        {
            // print solution
            print(board,N);
        }
        else {
            System.out.println("No solution");
        }
    }

    
    
}