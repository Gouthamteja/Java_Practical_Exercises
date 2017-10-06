package java_misc;
 
public class PE4 {
	public static void main(String[] args) {
		
		try {
			int arr[] =  new int[-1]; 
		}catch(NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException"); 
		}
		
		try{
			throw new IndexOutOfBoundsException();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
