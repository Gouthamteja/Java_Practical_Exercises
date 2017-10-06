package com.client.java;

import com.stackroute.java.robo.*;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {

        Robo robo = new Robo();
        Scanner scn3 = new Scanner(System.in);
         Float num1 = scn3.nextFloat();
       Scanner scn1 = new Scanner(System.in);
         Float num2 = scn1.nextFloat();
        Scanner scn2 = new Scanner(System.in);
        String str = scn2.nextLine();
        
        Float result = robo.compute(num1,num2,str);
        
       System.out.println(result);
    }}
