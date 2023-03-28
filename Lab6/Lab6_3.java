class Outer
{
	int i=5;
	Inner in=new Inner();
	void outerShow()
	{
		in.show();
	}
	private class Inner
	{
		private void show()
		{
			System.out.println("Inner class" +i);
		}
	}
}
class Lab6_3
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.outerShow();
		//Outer.Inner i=new Outer().new Inner(); //ERROR: Inner has private access
	}
}