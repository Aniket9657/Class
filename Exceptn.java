public class Exceptn {
	// exception handling 
	public static void main(String[]args) {
		
		
		int a = 10 ;
		int b = 0 ;
		
	
	try {
		
		int c = a/b ;
		
		System.out.println(" the Divison is"+c);
		
		
		
	}catch (ArithmeticException e)
	{
		System.out.println(" You are dividing a nuber with Zero Dumbass go to elimentary Scho0l");
		
	}
	
     finally {
    	 System.out.println(" Cleaning Your mEss");
     }
	
	}

}
