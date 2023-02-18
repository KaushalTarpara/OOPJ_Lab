//import java.io.*;
class HelloDDU
{
	public static void main(String args[])
	{
		int $number=Integer.parseInt(args[0]);
		int _power=Integer.parseInt(args[1]);

		while(_power > 2)
		{
			$number*=$number;
			--_power;
		}
		System.out.println(args[0]+" ^ "+args[1] +" = "+ $number);


	}
}