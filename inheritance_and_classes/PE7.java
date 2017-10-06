package inheritance_and_classes;

public class PE7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
