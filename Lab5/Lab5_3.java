interface Tossable
{
	 public void toss();
}
class Ball implements Tossable
{
	String brandName;
	Ball()
	{

	}
	public String getBrandName(String brandName)
	{
		return brandName;
	}
	public void bounce()
	{
	}
	public void toss()
	{
	}
}
class Rock implements Tossable
{
	public void toss()
	{
	}
}
class Baseball extends Ball implements Tossable
{
	Baseball(String brandName)
	{

	}
	public void toss()
	{

	}
    public void bounce()
	{

	}
}
class Football extends Ball implements Tossable
{
	Football(String brandName)
	{

	}
	public void toss()
	{

	}
    public void bounce()
	{

	}
}
class Lab5_3
{
	public static void main(String args[])
	{
		System.out.println("Success");
	}
}