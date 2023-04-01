class Student
{
	String IdNo="20MAPOG010";
	int sem=2;
	String name="KAUSHAL TARPARA",department="MCA";

	void displayInfo()
	{
		class Result
	    {
		
		int tot=470;
		float per=((tot*100)/500);
		String result="DISTICTION";
		void displayResult()
		{
			System.out.println("Idno= "+IdNo);
			System.out.println("Name= "+name);
			System.out.println("Sem= "+sem);
			System.out.println("Department= "+department);
			System.out.println("Total Marks Of 5 Subjects= "+tot);
			System.out.println("Percentage= "+per);
			System.out.println("Result= "+result);
		}
	}
		Result r= new Result();
		r.displayResult();
	}

	void displayInfo2()
	{
		class Result
	    {
		
		int tot=470;
		float per=((tot*100)/500);
		String result="DISTICTION";
		void displayResult()
		{
			System.out.println("Idno= "+IdNo);
			System.out.println("Name= "+name);
			System.out.println("Sem= "+sem);
			System.out.println("Department= "+department);
			System.out.println("Total Marks Of 5 Subjects= "+tot);
			System.out.println("Percentage= "+per);
			System.out.println("Result= "+result);
		}
	}
		Result r= new Result();
		r.displayResult();
	}
	
	
}
class Lab6_1
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.displayInfo();
		s.displayInfo2();
	}
}