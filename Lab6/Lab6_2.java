class Outer
{
  static int RollNO=68;
  static String name="Kd Tarpara";
  static String Conctno="898066XXXX";
  static class Inner
  {
  	 void msg()
  	 {
		   System.out.println("Roll No is "+RollNO);
		   System.out.println("Name  is "+name);
		   System.out.println("Contact No is "+Conctno);
	 }
  }
}
  class Lab6_2
  {
  	public static void main(String args[])
  	{
  		Outer.Inner obj=new Outer.Inner();
  		obj.msg();
  	}
  }
