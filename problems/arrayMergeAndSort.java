package problems;

import java.util.*;

public class arrayMergeAndSort {

	public static void sortMerge(int a[],int b[], int res[], int p, int q) {
		
		int i=0,j=0,k=0;
		
		while(i<p) {
			res[k] = a[i];
			i++;
			k++;
		}
		while(j<q) {
			res[k] = b[j];
			k++;
			j++;
		}
		Arrays.sort(res);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int j;
		System.out.println("Enter array size5");
		x = sc.nextInt();
  int n[] = new int[x];
  System.out.println("Enter array");
  for(j=0;j<x;j++) {
	  n[j] = sc.nextInt();
  }
  int m[] = {6,1,9,4};
  int p = n.length;
  int q = m.length;
  int i;
  int res[] = new int[p+q];
  sortMerge(n,m,res,p,q);
  for(i=0;i<p+q;i++) {
	  System.out.print(res[i] + " ");
  }
	}

}
