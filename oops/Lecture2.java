package oops;


class Student {
	
	String name ;
	 int age;
	 
	 public void details() {
		 System.out.println(this.name);
		 System.out.println(this.age);
	 }
	 
//	 constructor(non parametrized)
	 Student(){
		 System.out.println("constructor is called");
	 }
//	 non parameterized constructors in lecture3
}

public class Lecture2 {
	public static void main(String args[]) {
		
	
	Student s1 = new Student();  //whenever an object is made the construtor is called automatically
	s1.age=20;
	s1.name="Abhijeet";
	s1.details();
	
	}
}
