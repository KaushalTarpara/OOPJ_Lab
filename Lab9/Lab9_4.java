import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Lab9_4
{
 public static void main(String args[]){

	Scanner s=new Scanner(System.in);
	int choice;
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	while(true)
	{
		System.out.println("Press 1. For Insert");
		System.out.println("Press 2. For Update");
		System.out.println("Press 3. For Delete");
		System.out.println("Press 4. For Display Using Iterator");
		System.out.println("Press 5. For Exit");
		System.out.print("Enter Choice:");
		choice=s.nextInt();

		switch(choice)
		{
			case 1:
					int index;
					String data;
					System.out.println("Enter Integer Index:");
					index=s.nextInt();
					System.out.println("Enter String Data:");
					data=s.next();
					hm.put(index,data);
					break;
			case 2:
					int flag=0;
					int uindex;
					String udata;
					System.out.println("Enter Integer Index:");
					uindex=s.nextInt();
					Iterator hmIte = hm.entrySet().iterator();


					while (hmIte.hasNext()) {
						Map.Entry mapElement = (Map.Entry)hmIte.next();
						if(uindex==(int)mapElement.getKey())
							flag=1;
					}
					if(flag==1)
					{
						System.out.println("Enter String Data:");
						udata=s.next();
						hm.put(uindex,udata);
					}
					else
					{
						System.out.println("Index Not found");
					}
					break;
			case 3:
					int dindex;
					System.out.println("Enter Index Value:");
					dindex=s.nextInt();
					hm.remove(dindex);
					break;
			case 4:
					Iterator hmIterator = hm.entrySet().iterator();


					while (hmIterator.hasNext())
					{
						Map.Entry mapElement = (Map.Entry)hmIterator.next();
						System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
					}
					break;
			case 0:
					return;

		}

		}
	}
}