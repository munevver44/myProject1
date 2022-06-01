package coreJava;



public class hmCode10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int	array[] = {1,9,5,2,8,3,55,5};
		
		int n;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++) { 
				
				if(array[i]<array[j])
				{
					n=array[i];
					array[i]=array[j];
					array[j]=n;
				}
				}
				
				
			}
			System.out.println("second largest element " +array[1]);
			
		}
		
		
   		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


