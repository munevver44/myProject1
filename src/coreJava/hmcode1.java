package coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class hmcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int total =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter array size ");
		int size = scan.nextInt();
		int array[] = new int[size];
		
		
		System.out.println("Please enter elements ");
		for(int i=0; i<size; i++) {
			array[i] = scan.nextInt();
			total = total+array[i];
		}
		System.out.println("Array elements are :"+Arrays.toString(array));
		System.out.println("The sum is :"+" "+total);
}
}
