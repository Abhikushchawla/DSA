package problems;

import java.util.Stack;
import java.util.Scanner;
public class reverseStack {

	public static void reverse(Stack<Integer> st) {
		Stack<Integer> temp = new Stack<Integer>();
		while(!st.isEmpty()) {
			temp.push(st.pop());
			
		}
		while(!temp.isEmpty())
			System.out.println(temp.pop());
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("define size");
		int i;
		int num =  sc.nextInt();
		for(i=0;i<num;i++) {
			s.push(null) = sc.nextInt();
		}
		
		reverse(s);

	}

}
