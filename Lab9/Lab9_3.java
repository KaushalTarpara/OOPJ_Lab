import java.util.*;

public class Lab9_3
{
 public static void main(String args[]){

	Scanner s=new Scanner(System.in);
	int choice;
	HashSet<Integer> hs=new HashSet<Integer>();
	while(true)
	{
		System.out.println("Press 1. For Insert");
		System.out.println("Press 2. For Update");
		System.out.println("Press 3. For Delete");
		System.out.println("Press 4. For Display Using Iterator");
		System.out.println("Press 5. For Exit");
		System.out.print("Enter Your Choice:");
		choice=s.nextInt();
		switch(choice)
		{
			case 1:
					int data;
					System.out.println("Enter Data:");
					data=s.nextInt();
					hs.add(data);
					break;
			case 2:
					int d1,d2;
					System.out.println("Enter old data:");
					d1=s.nextInt();
					System.out.println("Enter Update Data:");
					d2=s.nextInt();
					hs.remove(d1);
					hs.add(d2);
					break;
			case 3:
					int dindex;
					System.out.println("Enter Data Value:");
					dindex=s.nextInt();
					hs.remove(dindex);
					break;
			case 4:
					Iterator<Integer> iter= hs.iterator();

					System.out.println("\nThe iterator values"+ " of set are: ");
					while (iter.hasNext())
					{
						System.out.print(iter.next() + "\t\t");
					}
					System.out.println("");
					break;
			case 0:
					return;

		}

		}
	}
}