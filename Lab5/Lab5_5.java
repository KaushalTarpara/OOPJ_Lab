class Employee
{
	private int no;
	private String name;
	private double hours,price;
	Employee(int no,String name,double hours,double price)
	{
		this.no=no;
		this.name=name;
		this.hours=hours;
		this.price=price;
	}
	void setNo(int no)
	{
		this.no=no;
	}
	int getNo()
	{
		return no;
	}
	void setName(String name)
	{
		this.name=name;
	}
	private String getName()
	{
		return name;
	}
	final class HourlyEmp
	{
		double hours,price;
		HourlyEmp(double hours,double price)
	{
		this.hours=hours;
		this.price=price;
	}
	protected void display()
	{
		System.out.println("No= " +getNo());
		System.out.println("Name= " +name);
		System.out.println("Hours= " +hours);
		System.out.println("Price= " +price);
	}
	}
}
class Lab5_5
{
	public static void main(String arg[])
	{
		Employee e=new Employee(25,"RAJAA",26,10500);
		Employee.HourlyEmp he=e.new HourlyEmp(30,2000);
		he.display();
	}
}