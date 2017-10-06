package inheritance_and_classes;
 
class CustomException extends Exception{
	public CustomException(String messsage) {
		System.out.println(messsage);
	}
}
public class PE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException("Throwing an exception!");
		}catch(Exception e) {
			
		}finally {
			System.out.println("Caught the exception!");
		}
	}

}
