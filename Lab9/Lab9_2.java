import java.util.*;
import java.io.*;
public class Lab9_2
{
	public static void main(String args[]){
	String data;
	Scanner s=new Scanner(System.in);
	int choice;
	LinkedList<String> ll=new LinkedList<String>();
	while(true)
	{
		System.out.println("Press 1. For Add At First Posotion");
		System.out.println("Press 2. For Add At Last  Posotion");
		System.out.println("Press 3. For Delete From First Posotion");
		System.out.println("Press 4. For Delete From Last Posotion");
		System.out.println("Press 5. For Update specific index node value");
		System.out.println("Press 6. For Remove from specific index");
		System.out.println("Press 7. For Display Using Iterator");
		System.out.println("Press 8. For Exit");
		System.out.print("Enter Choice:");
		choice=s.nextInt();

		switch(choice)
		{
			case 1:
					System.out.println("Enter Data:");
					data=s.next();
					ll.addFirst(data);
					break;
			case 2:
					System.out.println("Enter Data:");
					data=s.next();
					ll.addLast(data);
					break;
			case 3:
					ll.removeFirst();
					break;
			case 4:
					ll.removeLast();
					break;
			case 5:
					String datau;
					int index;
					System.out.println("Enter Index:");
					index=s.nextInt();
					System.out.println("Enter Update Data:");
					datau=s.next();
					ll.set(index,datau);
					break;
			case 6:
					int dindex;
					System.out.println("Enter Index:");
					dindex=s.nextInt();
					ll.remove(dindex);
					break;
			case 7:
					Iterator<String> iter= ll.iterator();

					System.out.println("\nThe iterator values"+ " of list are: ");
					while (iter.hasNext())
					{
						System.out.print(iter.next() + " \t\t");
					}
					System.out.println("");
					break;
			case 8:
					return;

		}

		}
	}
}