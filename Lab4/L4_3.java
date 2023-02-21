abstract class Geometry
{
	float perimeter;
	abstract void perimeter();
}
class Square extends Geometry
{
	float len;

	void claculate(float l)
	{
		perimeter=(4*l);
	}
	void perimeter()
	{
		System.out.println("Perimeter of square="+perimeter);
	}
}
class Circle extends Geometry
{
	float rad;
	void calcu(float r)
	{
		perimeter=(2*3.14f*r);
	}

	void perimeter()
	{
		System.out.println("Perimeter of circle="+perimeter);
	}
}
class L4_3
{
	public static void main(String args[])
	{
		Square s= new Square();
		s.claculate(5);
		s.perimeter();
		Circle c=new Circle();
		c.calcu(2);
		c.perimeter();
	}
}