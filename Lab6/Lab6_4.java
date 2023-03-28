class PersonalComputer
{
	int Price=105500;
	String color="Black",model="Asus Rog";
	class Processor
	{
		String pr="Intel I5";
	}
	class RAM
	{
		String ram="16 GB";
	}
	class HardDisk
	{
		String hdd="2 TB";
	}
	class MotherBoard
	{
		String mb="GIGABYTE";
	}
	void display()
	{
		System.out.println("Details about Personal Computer");
		System.out.println("Price= "+Price);
		System.out.println("Color= "+color);
		System.out.println("MOdel= "+model);
		Processor p1=new Processor();
		System.out.println("Processor Name= "+p1.pr);
		RAM r1=new RAM();
		System.out.println("RAM= "+r1.ram);
		HardDisk h1=new HardDisk();
		System.out.println("Hard Disk= "+h1.hdd);
		MotherBoard m1=new MotherBoard();
		System.out.println("MotherBoard= "+m1.mb);
	
	}

}
class Lab6_4
{
	public static void main(String args[])
	{
		PersonalComputer pc = new PersonalComputer();
		pc.display();

	}
}