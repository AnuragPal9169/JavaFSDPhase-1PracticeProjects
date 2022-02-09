package com.org.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void readfile() throws IOException
	{
		Scanner s=new Scanner(System.in);
		try
		{
			String fname;
			System.out.println("Enter file name:");
			fname=s.nextLine();
			File file=new File("D:\\FileDemo\\"+fname);
			int i;
			//checking whether the filename provided by the user is present or not
			if(file.exists())
			{
				FileReader reader=new FileReader(file);
				//reading file
				while((i=reader.read())!=-1)
				{
					System.out.print((char)i);
				}
				System.out.println("\n");
				reader.close();
			}
			else
			{
				System.out.println("File not found");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writefile() throws IOException
	{
		Scanner s1=new Scanner(System.in);
		try
		{
			String fname1;
			System.out.println("Enter file name:");
			fname1=s1.nextLine();
			String overwrite;
			File file1=new File("D:\\FileDemo\\"+fname1);
			//checking whether the filename provided by the user is present or not
			if(file1.exists())
			{
				FileWriter writer=new FileWriter(file1);
				System.out.println("Enter text to overwrite:");
				overwrite=s1.nextLine();
				//overwriting file
				writer.write(overwrite);
				writer.close();
				System.out.println("File Overwritten, please check");
			}
			else
			{
				System.out.println("File not found");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void append() throws IOException
	{
		Scanner s2=new Scanner(System.in);
		try
		{
			String fname2;
			System.out.println("Enter file name:");
			fname2=s2.nextLine();
			String text;
			File file2=new File("D:\\FileDemo\\"+fname2);
			//checking whether the filename provided by the user is present or not
			if(file2.exists())
			{
				FileWriter append=new FileWriter(file2,true);
				BufferedWriter ap=new BufferedWriter(append);
				System.out.println("Enter text to be appended at the end of the file:");
				text=s2.nextLine();
				//appending text at the end of the file
				ap.write(text);
				ap.close();
				System.out.println("File Appended, please check");
			}
			else
			{
				System.out.println("File not found");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
			int c;
			//do-while loop used to loop switch cases over and over unless user inputs 4
			do
			{
				System.out.println("\nFile Handling\n");
				System.out.println("-----Menu-----\n1.Read a file\n2.Write a file\n3.Append a file\n4.Exit");
				System.out.println("Enter your choice: ");
				c=sc.nextInt();
				switch(c)
				{
					case 1:
						//calling readfile() method
						try {
							readfile();
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 2:
						//calling writefile() method
						try {
							writefile();
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 3:
						//calling append method
						try {
							append();
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 4:
						//Closing switch case
						System.out.println("Exited");
						break;
					default:
						System.out.println("Please enter a valid choice");
						break;
				}
			}while(c!=4);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
