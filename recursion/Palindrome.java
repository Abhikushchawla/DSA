package recursion;


public class Palindrome {
	  static boolean isPalRec(String str,
              int s, int n)
{

  if (s == n-s-1)
  return true;


  if ((str.charAt(s)) != (str.charAt(n-s-1)))
  return false;


  
  return isPalRec(str, s + 1, n);
}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aman";
		boolean x = isPalRec(str,0,str.length());
				
				if(x) {
					System.out.println("yes");
				}
				else
					System.out.println("no");
	}

}
