import java.lang.reflect.*;
interface A
{
	void dipslay();
}
interface B
{
	void dipslay1(int i);
}
class Lab6_1A
{
	int a;
	float b;
}
final class Lab6_1B extends Lab6_1A implements A,B
{
	public int a;
	public float b;
	public Lab6_1B()throws NumberFormatException
	{

	}
	private Lab6_1B(int i) throws NullPointerException
	{

	}
	public void dipslay()throws NullPointerException
	{
		System.out.println("Display methods");
	}
	public void dipslay1(int i)throws NumberFormatException
	{
		System.out.println("Display methods");
	}
}
class Lab6_5
{
	public static void main(String args[])throws ClassNotFoundException,IllegalAccessException
	{
		Lab6_1B b=new Lab6_1B();
		Class c=b.getClass();
		System.out.println("_______________________Class:______________");
		System.out.println("Class name :" + c.getName());
		System.out.println("Super class name :" +c.getSuperclass());
		System.out.println("Hase code :" +b.hashCode());
		System.out.println("Interface Checks:" +c. isInterface());
		System.out.println("________________Interface:_______________");
		Class interfaces[]=c.getInterfaces();
		for(Class c1:interfaces)
		{
			System.out.println("interfaces" + c1.getName());
		}
		System.out.println("Modifired:" + Modifier.toString(c.getModifiers()));
		System.out.println("__________________Fields:______________");
		Field f2[]=c.getFields();
		for(Field f1:f2)
		{
			System.out.println("Fields :" + f1.getName());
		}
		Field f[]=c.getDeclaredFields();
		for(Field f1:f)
		{
			System.out.println("Fields :" + f1.getName());
			System.out.println("Modifier :" + Modifier.toString(f1.getModifiers()));
			System.out.println("Data Type :" + f1.getType());
		}
		System.out.println("__________________Methods:_______________");
		Method m[]=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println("Method name :" + m1.getName());
			System.out.println("Modifier :" + Modifier.toString(m1.getModifiers()));
			System.out.println("REturn type :" + m1.getReturnType());
			Class[] types = m1.getParameterTypes();
			for(Class t:types)
			System.out.println("Parameter:" +t);
			Class[] exep=m1.getExceptionTypes();
			for(Class e1:exep)
			System.out.println("Exception= " +e1.getName());
		}
		System.out.println("_________Constructor:______________________");
		Constructor con[]=c.getConstructors();
		for(Constructor con1:con)
		{
			System.out.println("Constructor name :" + con1.getName());
			System.out.println("Modifier :" + Modifier.toString(con1.getModifiers()));
			Class[] cls=con1.getParameterTypes();
			for(Class cc :cls)
			{
				System.out.println("getParameterTypes() = "+cc.getName());
			}
		}
		Constructor con2[]=c.getDeclaredConstructors();
		for(Constructor con1:con2)
		{
			System.out.println("Constructor name :" + con1.getName());
			System.out.println("Modifier :" + Modifier.toString(con1.getModifiers()));
			Class par[] = con1.getParameterTypes();
			for(Class par1:par)
			{
				System.out.println("Parameter:" +par1.getName());
			}
			Class[] exep=con1.getExceptionTypes();
			for(Class e1:exep)
				System.out.println("Exception= " +e1.getName());
		}
		Integer i=new Integer(5);
		int j=i;
		System.out.println("j-[unboxing]= "+j);
		Integer k=i;
		System.out.println("j-[autoboxing]= "+k);
	}
}