package coreJava;

public class hmCode8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		
		  int one=0;
          int two=1;
          int total=0;

         System.out.print(one+ "  " +two);
         
         for (int a=2;a<=10;a++) {
        	 
        	 
        	 
        	 total=one+two;
        	 System.out.print("  " +total);
        	 one=two;
        	 two=total;
         }
	}

}
