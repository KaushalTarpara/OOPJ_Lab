import java.util.ArrayList;
import java.util.Iterator;
public class Lab9_1
{
	public static void main(String[] args)
	{
		ArrayList<String> subjects= new ArrayList<String>();
		System.out.println("ArrayList:");
		
		subjects.add("OOPJ");
		subjects.add("OSLP");
		subjects.add("SE");
		subjects.add("CSDF");
		
		System.out.println(subjects);
		System.out.println("");
		
		System.out.println("Arraylist After Removing One Element :");
		subjects.remove(3);
		System.out.println("Arraylist now :" + subjects);
		System.out.println("");
		
		subjects.set( subjects.indexOf("SE") , "DSA");
		System.out.println(subjects);
		System.out.println("");
		Object[] objects = subjects.toArray();
		
		System.out.println("Array List into Array:");
		for (Object obj : objects)
		{
			System.out.print(obj + " ");
		}
		System.out.println("");
		System.out.println("");
		
		Iterator <String> it = subjects.iterator();
		System.out.println("arrayList:");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
