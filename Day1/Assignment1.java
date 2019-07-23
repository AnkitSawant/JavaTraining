package com.ct;

import java.util.Scanner;
import java.lang.Math;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num,length = 0,temp;
		num = scn.nextInt();
		temp = num;
		while(temp > 0)
		{
			temp /= 10;
			length++;
		}
//		System.out.println(length);
		String[] a = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
//		System.out.println(a[1]);
		int i=1;
		while(num > 0)
		{
			temp = (int) (num / Math.pow(10, (length - i)));
			System.out.print(a[temp]);
			num = (int) (num % Math.pow(10, (length - i)));
			i++;
		}
		
	}

}
