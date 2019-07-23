package com.ct;
import java.util.Scanner;
public class Assignement3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum = num;
		while(sum > 9)
		{
			sum = Addition.Sum(sum);
		}
		System.out.println(sum);
	}
}
class Addition {
	public static int Sum(int num) {
		int sum=0;
		while(num>0)
		{
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}
