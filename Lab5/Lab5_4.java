interface Arithmetic
{
	 public int add(int a,int b);
	 public int sub(int a,int b);
	 public int mul(int a,int b);
	 public int div(int a,int b);

}
class imple implements Arithmetic
{
		 public int add(int a,int b)
		 {
			 return(a+b);
		 }
		 public int sub(int a,int b)
		 {
			 return(a-b);
		 }
		 public int mul(int a,int b)
		 {
			 return(a*b);
		 }
		 public int div(int a,int b)
		 {
			 return(a/b);
	     }
}
class Lab5_4
{
	public static void main(String args[])
	{
		System.out.println("Success");
		int a=10,b=5;
		imple a1=new imple();
		int ad=a1.add(a,b);
		int sb=a1.sub(a,b);
		int ml=a1.mul(a,b);
		int dv=a1.div(a,b);
		System.out.println("Addition Of"+a+"And"+b+"="+ad);
		System.out.println("Sutraction Of"+a+"And"+b+"="+sb);
		System.out.println("Multification Of"+a+"And"+b+"="+ml);
		System.out.println("Division Of"+a+"And"+b+"="+dv);

	}
}