package com.org.emailvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationofEmailID {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
			String a[] = {"abc@gmail.com", "def@gmail.com", "ghi@gmail.com", "jkl@gmail.com", "mno@gmail.com"};
			String email;
			int i,flag=0;
			System.out.println("Enter Email ID:");
			email=sc.nextLine();
			String pattern = "^[A-Za-z0-9+_.]+@(.+)$";
			Pattern p=Pattern.compile(pattern);
			Matcher match= p.matcher(email);
			//checking the email ID provided by the user against the aforementioned pattern
			if(match.matches())
			{
				for(i=0;i<a.length;i++)
				{
					if(email.equals(a[i]))
					{
						System.out.println("Email Validated");
						break;
					}
					else
					{
						flag=1;
					}
				}
			}
			else
				System.out.println("Please enter valid email ID");
			
			if(flag==1)
				System.out.println("Email not found");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
