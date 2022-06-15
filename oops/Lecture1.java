package oops;

class Pen {
//	properties
	String color;
	String type;
	
//function
	
	public void write() {
		System.out.println("writting something");
	}
	
	public void printColor()
{
		System.out.println(this.color);
//		confusion in "this" keyword
		}
	
}




public class Lecture1{
	public static void main(String args[]) {
	
//		"new" keyword will allocate a storage in memory heap and the whole object will be stored at that location
//		Pen is not a function it is a constructor
		
		Pen pen1 = new Pen();
		pen1.color ="Blue";
		pen1.type= "gel";
		
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color="red";
		
		pen1.printColor();
		pen2.printColor();
		System.out.println();
		
		
	
	}
}
	
