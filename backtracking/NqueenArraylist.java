package backtracking;
import java.util.*;
import java.util.*;

public class NqueenArraylist {

	
static //	globally defining Arraylist for Arraylists
	ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
	
	
//	x and y is the current position in which the queen is to be checked weather to place or not
	public static boolean isSafe(char[][] matrix, int x,int y){
        //vertical
        for(int i=x-1;i>=0;i--){
            if(matrix[i][y] == 'Q'){
                return false;
            }
        }
        
        //left diagonal
        for(int i=x-1,j=y-1;i>=0 && j>=0 ; i--,j--){
            if(matrix[i][j] == 'Q'){
                return false;
            }
        }
        
        //right diagonal
        for(int i=x-1,j=y+1;i >=0 && j < matrix[0].length; i--, j++){
            if(matrix[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
	
	
	public static void Util(char [][]mat, int row) {
		if(row==mat.length) {
			
			ArrayList<String> ll = new ArrayList<String>();
			
			for(int i=0;i<mat.length;i++) {
				String str ="";
				for(int j=0;j<mat[0].length;j++) {
					if(mat[i][j]=='Q')
						str+="Q";
					else
						str+=".";
				}
				ll.add(str);
			}
			list.add(ll);
			return;
		}
		
//		for all colums of a row
		for(int i=0;i<mat.length;i++) {
			if(isSafe(mat,row,i)) {
				mat[row][i] = 'Q';
				Util(mat,row+1);
			}
			mat[row][i]='.';
		}
		
	}
	 
    
	
	public static ArrayList<ArrayList<String>> print( int n ){
		
		char [][] matrix = new char[n][n];
		
		 for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[0].length;j++){
	                matrix[i][j] = '.';
	            }
	        }
		 
		 Util(matrix,0);
		 return list;
	}
	
	public void pritnList(ArrayList<ArrayList<Integer>> aList) {
	for (int i = 0; i < aList.size(); i++) {
        for (int j = 0; j < aList.get(i).size(); j++) {
            System.out.print(aList.get(i).get(j) + " ");
        }
        System.out.println();
    }
	}
	
	public static void main(String []args) {
		int n =4;
		char [][]mat = new char[n][n];
		Util(mat,4);
		print(n);
}
	
}
