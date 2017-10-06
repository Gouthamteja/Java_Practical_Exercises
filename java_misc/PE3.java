package java_misc;

class CustomException extends Exception{
	public CustomException(String messsage) {
		System.out.println(messsage);
	}
}
public class PE3 {
	public static void main(String[] args) {
		try {
			throw new CustomException("Throwing an exception!");
		}catch(Exception e) {
			
		}finally {
			System.out.println("Caught the exception!");
		}
	}
}