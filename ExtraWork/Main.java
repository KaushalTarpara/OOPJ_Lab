

final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) 
    {
        this.re=re;
        this.im=im;
    }

    public String toString() 
    { return "("+re+" + "+im+ "i)";

    }
}
class Main
{
    public static void main(String args[])
    {
        Complex c=new Complex(10, 15); 
        System.out.println("Complex number is " + c);
    }
}

// public class Main{
//     public void divide(int a, int b){

//         try {
//             int c = a/b;
//         }catch(Exception e) {
//             System.out.print("Exception ");
//         } finally {
//             System.out.println("Finally");
//     }


//         public static void main(String args[])
//         { Main t = new Main();

//             t.divide(0,3);
//         }

// }


// (b) What will be the result if NullPointerException occurs at line 27

// 1. try(

// lisome code goes here

// 2. 3.)

// 4. catch(NullPointerException ne) { System.out.print("1");

// 5. 6.)

// catch(RuntimeException re)

// 7. 8. System.out.print("2");

// 9. } 10. finally

// 11. System.out.print("3"),

// 12.)