package com.starReverse;

public class StarReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=6;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
