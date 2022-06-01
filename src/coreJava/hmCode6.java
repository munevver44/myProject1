package coreJava;

import java.util.Scanner;

public class hmCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int num1 = scan.nextInt();
		System.out.println("Please enter 2nd number");
		int num2 = scan.nextInt();
		System.out.println("Lets swap your numbers");
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Now 1st number is " + num1);
		System.out.println("and 2nd number is " + num2);
		
		System.out.println();
	}

}
