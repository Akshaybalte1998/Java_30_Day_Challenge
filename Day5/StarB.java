package com.star;

public class StarB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==6||j==1||j==6)
				{
					System.out.print("*");
				}
				
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
/*
****** 
*    * 
*    * 
*    * 
*    * 
****** 
*/