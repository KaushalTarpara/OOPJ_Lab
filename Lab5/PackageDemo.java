package Mypackage;
import Mypackage.Calculate;
class PackageDemo
{
  public static void main(String args[])
  {
   
   Calculate obj = new Calculate();
   
   double vol=obj.volume(2.4,3.2,3.2);   
   System.out.println("Volume="+vol);
   
   int adi=obj.add(5,10);
   System.out.println("Addition="+adi);
  }
}