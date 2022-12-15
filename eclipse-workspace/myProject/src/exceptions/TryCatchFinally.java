package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		String s=null;
		try 
		{
			System.out.println(s.length());
			
		}
		catch(NullPointerException e)
		{
			System.out.println("String vlaue should not be null");
			
		}
		finally
		{
			System.out.println("finally block excuted ");
			
		}
		
		
		

	}

}
