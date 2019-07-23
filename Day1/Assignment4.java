package com.ct;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int product = num1;
		for(int i=1;i<=num2-1;i++)
		{
			product +=  num1;
		}
		System.out.println(num1 + " * " + num2 + " = " + product);
	}

}
