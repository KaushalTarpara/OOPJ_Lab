class Lab7_1
{
	public static void main(String args[])
	{
		int num1, num2;
 		String str = "Hello Exception ,You are handel by  KD";
 		try
		{
			//str.charAt(98);
 			System.out.println("String Index is valid");
 			num1 = 0;
 			num2 = 62 / num1;
 			System.out.println(num2);
 			System.out.println("end of try block");
 		}
 		catch (StringIndexOutOfBoundsException e)
		{
			 System.out.println("String Index is out of bounds");
		}
 		catch (ArithmeticException e)
 		{
 			System.out.println("Not divide a number by zero");
 		}
 		catch (Exception e)
		{
			 System.out.println("Exception occurred");
		}
		finally
		{
				System.out.println("In-Finally Block That Always Executes");
		}


 	}

 }