/*Create a class with a non-default constructor (one with arguments) 
 * and no default constructor (no "no-arg" constructor). 
 * Create a second class that has a method that returns a 
 * reference to an object of the first class.Create the object 
 * that you return by making an anonymous inner class that inherits from the first class.*/

class Class1{
	public Class1(int i ){
		print(i);
	}
	public void print(int i) {
		System.out.println("Created using default constructor with int i = " + i);
	}
	public Class1() {
		// TODO Auto-generated constructor stub
	}
}
class Class2{
	public Class1 create(int i) {
		return new Class1(i);
	}
	
	public Class1 createAnonymous(int i) {
		return new Class1(i) {
			@Override
			public void print(int i){
				System.out.println("Created using anonymous function with int i = " + i);
			}
		};
	}
}
public class PE1{
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		Class1 class1 = class2.create(2);
		class1= class2.createAnonymous(3);
	}
}
