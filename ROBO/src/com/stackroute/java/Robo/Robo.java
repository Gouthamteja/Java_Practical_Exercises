package com.stackroute.java.robo;

import java.util.Scanner;

public class Robo {

	public static void main(String args[])
	{
		System.out.println("enter numebers and operator");

	
	Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    // nextDouble() reads the next double from the keyboard
    float f = reader.nextFloat();
    
    float s = reader.nextFloat();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = reader.next().charAt(0);
	
	float result =compute(f,s,operator);
    System.out.print(result);
	}
	
	
	
	static float compute(float first, float second, char operator)
	{
		float result = 0;
		switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.printf("Error! operator is not correct");
                break;
        }
		return result;
		
	}
	
	
}
