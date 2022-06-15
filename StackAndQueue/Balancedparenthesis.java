import java.util.*;

package StackAndQueue;

public class Balancedparenthesis {
	

	 static boolean ispar(String x)
	    {
	      boolean isBalanced = true;
	       int i;
	       Stack <Character> st = new Stack<Character>();
	       if(x.length()%2!=0)
	       return false;
	       for(i=0;i<x.length();i++){
	           char a = x.charAt(i);
	           if(a=='{' || a=='[' || a=='('){
	               st.push(a);
	           }
	           else {
	               if(a==')' && !st.isEmpty() && st.peek()=='(' || a==']' && !st.isEmpty() && st.peek()=='[' || a=='}' && !st.isEmpty() && st.peek()=='{')
	               st.pop();
	               else 
	               isBalanced=false;
	           }
	       }
	       return isBalanced;
	    }

}
