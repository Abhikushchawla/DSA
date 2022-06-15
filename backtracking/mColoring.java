package backtracking;

public class mColoring {
	
	public boolean isSafe(int i,int j,int V,boolean graph[][], int []color){
	       for (int k = 0; k < V; k++){
	            if (
	                graph[i][k]  && color[k] == j)
	                return false;}
	        return true;
	    }
	    
	   public boolean graphUtil(boolean graph[][], int m, int V,int []color,int i){
	    
	    if(i==V)
	    return true;
	    
	        for(int j=0;j<m;j++){
	            if(isSafe(i,j,V,graph,color))
	            {
	                color[i] = j;
	                if(graphUtil(graph,m,V,color,i+1))
	                    return true;
	                color[i] = -1;
	            }
	        
	    }
	    return false;
	   }
	    
	    public boolean graphColoring(boolean graph[][], int m, int n) {
	        // Your code here
	          int[] color = new int[n];
	   
	   for(int i=0;i<n;i++){
	       color[i] = -1;
	   }
	    return graphUtil(graph,m,n,color,0);
	    }
}
