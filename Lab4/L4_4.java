class Person
{
	double Salary;
	int PhoneNumber,Age;
	String name,Adress;
	void printSalary()
	{
		System.out.println("Salary=" + Salary);
	}
} 
class Employee extends Person
{
	String specialization,department;
	Employee(String name,int Age,int PhoneNumber,String Adress,double Salary,String specialization,String department)
	{
		super.name=name;
		super.Age=Age;
		super.PhoneNumber=PhoneNumber;
		super.Adress=Adress;
		super.Salary=Salary;
		this.specialization=specialization;
		this.department=department;
	}
	void display()
	{
		System.out.println("********EMPLOYEE DETAILS*******");
		System.out.println("Name=" + name);
		System.out.println("Age=" + Age );
		System.out.println("PhoneNumber="+ PhoneNumber );
		System.out.println("Address="+ Adress );
		System.out.println("Specializaton="+ specialization );
		System.out.println("Department="+ department );
	}
	void printSalary()
	{
		System.out.println("Salary=" + Salary);
	}
}
class Manager extends Person
{
	String specialization,department;
	Manager(String name,int Age,int PhoneNumber,String Adress,double Salary,String specialization,String department)
	{
		super.name=name;
		super.Age=Age;
		super.PhoneNumber=PhoneNumber;
		super.Adress=Adress;
		super.Salary=Salary;
		this.specialization=specialization;
		this.department=department;
	}
	void display()
	{
		System.out.println("********MANAGER DETAILS********");
		System.out.println("Name=" + name);
		System.out.println("Age=" + Age );
		System.out.println("PhoneNumber="+ PhoneNumber );
		System.out.println("Address="+ Adress );
		System.out.println("Specializaton="+ specialization );
		System.out.println("Departmenr="+ department );
	}
	void printSalary()
	{
		System.out.println("Salary=" + Salary);
	}
}
class L4_4
{
	public static void main(String ar[])
	{
		Employee e=new Employee("EMP1",25,1234567891,"JAMNAGAR",100000,"JAVA","MCA");
		e.display();
		e.printSalary();
		Manager m = new Manager("MAN1",35,1876543211,"AHMEDABAD",55000,"Management","HRD");
		m.display();
		m.printSalary();
	}
}