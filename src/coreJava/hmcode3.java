package coreJava;

public class hmcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] array= {
                {1,2,3,4,}, 
                {5,6,7,8},
                {9,1,2,3},
                {4,5,6,7},
           
               };

int sum=0;	

for(int i=0; i<array.length; i++) {
for (int j = 0; j<array[0].length; j++ )  {
	
sum = sum + array[i][j];	  
}


}

System.out.println(" total value of elements =  "  + sum);   
}


	}


