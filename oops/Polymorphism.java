package oops;

//function Overloading/Compile time polymorphism
//function Overrinding/Runtime polymorphism

class Child{
	String name;
	int age;
	
	public void Info(int age) {
		System.out.println(age);
	}
	
	public void Info(String name) {
		System.out.println(name);
	}
	
	public void Info(int age, String name) {
		System.out.println(age + " " + name);
	}
}


public class Polymorphism {  //compile time polymorphism

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c1 = new Child();
c1.Info(20);
c1.Info("kush");
c1.Info(10, "kush");
	}

}
