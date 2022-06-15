package oops;

class Account{
	public String name;
	protected String email;
	private String password;  //private can only be accessed within the class
//	to access it outside the class we use the function getters and setters (watch again at 46mins)
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPasssword(String pass) {
		 this.password = pass;
	}
}

public class accessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account ac = new Account();
ac.name = "Abhijeet";
ac.email = "ac9626";
ac.setPasssword("abhi");
System.out.println(ac.getPassword());
	}

}
