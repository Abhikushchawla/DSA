package recursion;

//question find  all the ASCII value of the character

public class subsetsorPowerset {
	
	public static void find(String str ,int i,String str1) {
		if(i==str.length()) {
			System.out.println(str1);
			return;
		}
		find(str,i+1,str1+str.charAt(i));
		find(str,i+1,str1);
	}
//	to understand the flow watch Anuj bhaiya 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abc";
		String str1 ="";
		find(str,0,str1);
	}
//go through kunal kushwaha video
	//also watch striver brute force approach
}
