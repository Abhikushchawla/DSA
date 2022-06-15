package oops;

//Things which are of no use any further are named as abstract 

abstract class Animal {
	
	void walk() {
	}
		
	void walking() {
		System.out.println("hello"); //you can define defination in abstract class but not in Interfaace class
	}
}

class Horse extends Animal {
	public void walk() {
		System.out.println("has 4 legs");
	}
}

class chicken extends Animal {
	public void walk() {
		System.out.println("has 2 legs");
	}
}
//there is no use of making object of Animal as it is not required so we make it abstract

// interface Animal{
//void walk();
//}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Horse h = new Horse();
h.walk();
		
	}

}
