package coreJava;

import java.util.Scanner;

public class hmCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int numbers;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter elements in array  ");
		numbers=scan.nextInt();
		int[] arrNum = new int[numbers];
		System.out.println("Please enter" + numbers + "elements :  ");
	for (int a=0; a<numbers; a++)
	{
	arrNum[a]=scan.nextInt();	
	}
	
	System.out.print("Even numbers : ");
	
	for (int a=0;a<numbers;a++)
	{
	if(arrNum[a]%2 == 0)
	{
		
	System.out.println(arrNum[a] + "  ");
	
	}
	
	
	
	
	}
	
	}

}
