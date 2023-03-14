interface I1{

    default void display(){
        System.out.println("I am Interface 1");
    }
}
interface I2{

    default int  display(){
        System.out.println("I am Interface 2");
        return 1;
    }
}

public class InterfaceDemo implements I1, I2 {

    public static void main(String args[]){

        InterfaceDemo objI=new InterfaceDemo();
        int x =objI.display();
        //I1.display();

    }    
}



//************************Interface *****************************/

// interface I1{

//     void display();
// }
// interface I2{

//     void display();
// }

// public class InterfaceDemo implements I1, I2 {

//     public void display(){
//             System.out.println("Main Class");
//     }
//     public static void main(String args[]){

//         InterfaceDemo objI=new InterfaceDemo();
//         objI.display();
//         //I1.display();

//     }    
// }