package oops;

class children{
	
	String name ;
	 int age;
	 
	 public void details() {
		 System.out.println(this.name);
		 System.out.println(this.age);
	 }
	 

//parameterized constructor
	 
children(String name, int age){
	this.name = name;
	this.age = age;  //this.age is the object which is below the class Student line ,whereas age after '=' is the parameter which is inside the constructor
}
}
//also see copy constructor at 18:00

//In java there is no destructor function it automatically deletes the objects and variables

public class Lecture3 {
	public static void main(String args[]) {
		children s1 = new children("Aman", 20);
		s1.details();
	}

}
