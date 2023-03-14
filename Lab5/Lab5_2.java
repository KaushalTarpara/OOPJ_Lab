interface Demo
{
	 public void show();
}
class A implements Demo
{
	public void show()
	{
		System.out.println("I am in class A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("I am in class B");
	}
}
class C extends B
{
	public void show()
	{
			System.out.println("I am in class C");
	}
}
class Lab5_2
{
	public static void main(String args[])
	{
		A a=new A();
		a.show();
		B b = new B();
		b.show();
		C c = new C();
		c.show();
	}
}