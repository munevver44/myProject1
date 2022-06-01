package coreJava;

public class hmCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
int[][] array = {{9,8,7,6},
		        
		         {4,3,2,1},
		         
		         {11,12,13,14}
		         
                 };
		
		int[] odd = new int [4];
		int[] even = new int [4];
		int allodd = 0;
		int alleven = 0;
		
		for(int a=0; a<array.length; a++) {
			odd[a]=0;
			even[a]=0;
			for(int b=0; b<array[a].length; b++) {
				if(array[a][b]%2==0) {
					even[a]+=array[a][b];
				} else {
					odd[a]+=array[a][b];
				}
			}
			
			for(int i: odd) {
				allodd+=i;
				
			for(int j:even) {
				alleven+=j;
			}
			}
			System.out.println("Sum of all odd numbers is " + allodd);
			System.out.println("Sum of all even numbers is " + alleven);
		}
		System.out.println();
	}
		
		
	}


