package coreJava;

public class hmCode11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] my_array = {"book", "abd", "joke", "book", "cool", "grow", "cool"};
		 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }
		
		
}

}
