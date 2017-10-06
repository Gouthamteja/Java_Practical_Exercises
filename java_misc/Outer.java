package java_misc;

public class Outer { 
	class Inner{
		
		public void display() {
			System.out.println("Inner class");
		} 
		
	}

	public void displayOuter() {
		// TODO Auto-generated method stub
		Inner inner = new Inner();
		inner.display();
	}
}
class Test{
	public static void main(String[] args) {
		Outer inner = new Outer();
		inner.displayOuter();
	}
}
