package com.org.arithmeticcalculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);		
		try {	
			int c, a=0, b=0, o=0;
			//do-while loop used to loop switch cases over and over unless user inputs 5
			do
			{				
				System.out.println("\nArithmetic Calculator\n");				
				System.out.println("-----Menu-----\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");				
				System.out.println("Enter your choice:");				
				c=sc.nextInt();				
				switch(c)				
				{					
					case 1:		
						//Addition
						System.out.println("Enter 2 numbers:");						
						a=sc.nextInt();						
						b=sc.nextInt();						
						o=a+b;						
						System.out.println("The addition of "+a+" and "+b+" is: "+o);						
						break;					
					case 2:			
						//Subtraction
						System.out.println("Enter 2 numbers:");						
						a=sc.nextInt();						
						b=sc.nextInt();						
						o=a-b;						
						System.out.println("The subtraction of "+a+" and "+b+" is: "+o);						
						break;					
					case 3:		
						//Multiplication
						System.out.println("Enter 2 numbers:");						
						a=sc.nextInt();						
						b=sc.nextInt();						
						o=a*b;						
						System.out.println("The multiplication of "+a+" and "+b+" is: "+o);						
						break;					
					case 4:		
						//Division
						System.out.println("Enter 2 numbers:");						
						a=sc.nextInt();						
						b=sc.nextInt();						
						o=a/b;						
						System.out.println("The division of "+a+" and "+b+" is: "+o);						
						break;					
					case 5:		
						//Closing switch case
						System.out.println("Exited");						
						break;					
					default:						
						System.out.println("Please enter valid choice!");
						break;				
				}			
			}while(c!=5);		
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();		
		}		
		finally {			
			sc.close();		
		}
	}
}
