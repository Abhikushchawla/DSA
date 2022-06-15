package oops;

class Shape{
	public void area() {
		System.out.println("displays area");
	}
}

class triangle extends Shape{
	
	public void area(int l,int h) {
		
		System.out.println(l*h*1/2);
	}

}

//class EquiTriangle extends triangle{
//	public void area(int s) {
//		System.out.println(s*s);
//	}
//}  //this is for multiple level inheritance

public class SingleLevelInheritance{
	public static void main(String args[]) {
		triangle t1 = new triangle();
		t1.area();
		t1.area(2,3);
		
	}
}