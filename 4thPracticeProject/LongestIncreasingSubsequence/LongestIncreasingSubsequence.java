package com.org.subsequence;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static int find(int[] a, int i) 
	{
        if (i == 0) 
        {
            return 1;
        }
        int l = 1;
        for (int j = 0; j < i; j++) 
        {
            if (a[i] > a[j]) 
            {
            	//recursively calling the find() method
                l = Math.max(l,find(a, j) + 1);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
        	System.out.println("Enter the number of elements:");
            int n=sc.nextInt();
            //checking if the number of elements provided by the user is greater than or equal to 100
            if(n>=100)
            	System.out.println("Limit reached");
            else
            {
            	int[] a=new int[n];
            	System.out.println("Enter elements:");
            	for(int i=0;i<n;i++)
            	{
            		a[i]=sc.nextInt();
            	}
            	//calling find() method
            	System.out.printf("Length of longest increasing subsequence: %d%n",find(a, n-1));
            }
        }
        catch(Exception e)
        {
        	e.printStackTrace();        
        }
        finally
        {
        	sc.close();
        }
    }
}
