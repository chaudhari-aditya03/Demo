package com.abc;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) throws Exception {
	int [] numbers = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 Numbers :-");
	for(int i = 0 ; i<=numbers.length-1;i++)
	{
		numbers[i]=sc.nextInt();
	}
	for(int i =0;i<=numbers.length-1;i++)
	{
		System.out.print(" "+numbers[i]+" ");
	}
	System.out.println("");
	for(int i=0;i<=numbers.length-1;i=i+2)
	{
		int temp = numbers[i];
		numbers[i] = numbers[i+1];
		numbers[i+1]=temp;
	}
	for(int i =0;i<=numbers.length-1;i++)
	{
		System.out.print(" "+numbers[i]+" ");
	}
	sc.close();
}

}
