package coreJava;

public class hmCode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 37;
		    boolean symbol = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for for the number which is not prime
		      if (num % i == 0) {
		        symbol = true;
		        break;
		      }
		    }

		    if (!symbol)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
	}


