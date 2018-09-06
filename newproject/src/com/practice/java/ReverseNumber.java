package com.practice.java;

import java.util.Scanner;

public class ReverseNumber {
	static int n,sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n value");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		
		while(n!=0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
System.out.println("reverse of number is"+sum);
	}

}
