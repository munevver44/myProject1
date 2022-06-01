package coreJava;

public class hmCode9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {23,45,69,11,189,8};
		int small=arr[0];
		int big=arr[0];
		for (int i=0;i<arr.length;i++) {
			
			if(big<arr[i]) {
				
			big=arr[i];
			}
			if(small>arr[i]) {
			
			small=arr[i];
		
		
		
			}
		}
		System.out.println("biggest and smallest in the array are   " + big + " and " + small );
		}
		
		
		
		
		
		
		
		
	

}
