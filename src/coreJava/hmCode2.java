package coreJava;


import java.util.Scanner;

public class hmCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	 String countries [][]=new String [3][4];
	 System.out.println("Please enter 12 countries ");
	 for (int i=0;i<3;i++) 
	 {
		 for ( int j=0;j<4;j++)
		 {
			 countries[i][j]=sc.nextLine();
			 
			 
		 }
		 
		 
	 }
	 System.out.println("given countries are :  ");
	 
	 for (int i=0;i<3;i++) 
	 {
		 for ( int j=0;j<4;j++)
		 {
			 
		System.out.print(countries[i][j] + " ,");	 
		 }
	 
	
	 }	
	}
	
}