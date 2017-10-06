import com.stackroute.java.robo.*;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String args[])
	{
		System.out.println("enter numebers and operator");
		ROBO robo=new ROBO();
	
	Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    // nextDouble() reads the next double from the keyboard
    float f = reader.nextFloat();
    
    float s = reader.nextFloat();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = reader.next().charAt(0);
	float result=robo.compute(f,s,operator);
    System.out.print(result);
	}
	
}
