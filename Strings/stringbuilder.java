package Strings;


//Search the question difference between string vs stringbuilder
public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder st = new StringBuilder("Tony");
		System.out.println(st.charAt(0));
		
//		set character
		st.setCharAt(0,'p');
		System.out.println(st);
		
//		to add a character
		st.insert(2, "n");
		System.out.println(st);
		
		// to delete one n from string
		st.delete(2,3);
		System.out.println(st);
		
		st.append("a"); //str = str+"a"
		
		st.append("b"); //str = str+"b"
		System.out.println(st);
	}

}
