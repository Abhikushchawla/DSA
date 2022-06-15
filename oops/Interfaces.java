package oops;

interface car{
	void start();
}

interface person{
	void walk();
}

public class Interfaces implements car,person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		System.out.println("Person walking ");
	}

	@Override
	public void start() {
		System.out.println("car getting started");
		
	}

}
