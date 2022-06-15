package Strings;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		String naam = c.nextLine();  // if we take only "c.next()" then it will only print "tony" instead of "tony stark"
		System.out.println("Name is "+ naam);

		
		for(int i=0;i<naam.length();i++) {
			System.out.println(naam.charAt(i));
		}
		System.out.println();
		System.out.println(naam.charAt(3));
		
		
//		comparing two strings
		
//		s1>s2:+ve value;
//		s1=s2:0;
//		s1<s2:-ve value;
		
		String n1 ="Tony";
		String n2 = "Sony";
		if(n1.compareTo(n2) == 0)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		
		
		if(new String("Tony") == new String("Tonny"))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
//		
//		Substrings
		
		String name = "tony Stark";
		String name1= name.substring(6);
		System.out.println(name1);
			
	}

}
