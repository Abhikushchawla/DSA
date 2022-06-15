package oops;


class parent{
	public void area() {
		System.out.println("displays area");
	}
}

class child extends parent{
	
	public void area(int l,int h) {
		
		System.out.println(l*h*1/2);
	}

}

class square extends child{
	public void area(int s) {
		System.out.println(s*s);
	}
}

public class Heirarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
