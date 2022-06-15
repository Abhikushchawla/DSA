package problems;
import  java.util.Stack;

public class reverseStackwithSame {

	public static void transfer(Stack<Integer> s1, Stack<Integer> s2, int n) {
		int i;
		for(i=0;i<n;i++) {
			s1.peek();
			s2.push(s1.pop());
		}
	}
	public static void reverse(Stack<Integer> st, int n) {
		Stack<Integer> temp = new Stack<Integer>();
		int i;
		int x;
		for(i=0;i<n;i++)
		{		 
			x = st.pop();
		transfer(st,temp,n-i-1);
		st.push(x);
		transfer(temp,st,n-i-1);
		}
		
		for(i=0;i<n;i++) {
			System.out.print(st.pop() + " ");
		}
	}
	public static void main(String[] args) {
		int n=5;
		Stack<Integer> sp = new Stack<Integer>();
		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		sp.push(5);
		reverse(sp,n);
		
		
	}

}
