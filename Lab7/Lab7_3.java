import java.util.*;
class NoMatchException extends Exception 
{
	NoMatchException(String msg)
 	{
 		super(msg + " is not equal to Object Oriented Programing with JAVA ");
 	}
}
public class Lab7_3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
 	try
 	{
 		System.out.print("Enter String : ");
 		String name=s.nextLine();
 		if(name.equals("Object Oriented Programing with JAVA"))
 		{
 			System.out.println(name+ " is equal to Object Oriented Programing with JAVA ");
		}
 		else
 		{
 		throw new NoMatchException(name);
		}
 	}
 		catch(NoMatchException e1)
 		{
 			System.out.print("Error Occured: " + e1.getMessage());
 		}
 }
}