class Outer{
      int a=1;
    void show(){
        System.out.println("This is Outer class Show method");
    }

    class Inner{

        int b=2;
        void Ishow(){
        System.out.println("This is Iuter class Show method");
        }
    
    }
 
}
class AnoDemo{
  public void print(){
    System.out.println("Using another class");
  }
}
class Nested
{
  public static void main(String args[]){
    Outer objO =new Outer();

    Outer.Inner objI=objO.new Inner();

    AnoDemo obj1=new AnoDemo(){
      public void print(){
          System.out.println("Using ano class");
      }   
    };
    obj1.print();

     AnoDemo obj2=new AnoDemo(){
      public void print(){
          System.out.println("Using ano2 class");
      }   
    };
    obj2.print();

//    objI.Ishow();
  }    
}