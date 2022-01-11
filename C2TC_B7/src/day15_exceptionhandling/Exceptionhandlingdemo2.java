package day15_exceptionhandling;

public class Exceptionhandlingdemo2 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{
			arr[4]=34;
			System.out.println("in try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception in try block");
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("In the class");
	}
}
