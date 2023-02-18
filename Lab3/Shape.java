import java.util.Scanner;
import java.io.IOException;
class Circle{
	int r;
	Circle(int redius){
		r=redius;
	}
	float  getArea(){
		return 	3.14f*r*r;
	}
}
class Triangle{
	int h,b;
	Triangle(int height,int base){
		h=height;
		b=base;
	}
	float  getArea(){
		return 	(h*b)/2;
	}
}
class Rectangle{
	int l,w;
	Rectangle(int length,int width){
		l=length;
		w=width;
	}
	float  getArea(){
		return 	(l*w);
	}
}
public class Shape{
	public static void main(String args[]) throws IOException, InterruptedException
	{

	Scanner sc=new Scanner(System.in);
	char userIn;
	do{
	System.out.println(" =========Menu======= \n1)Cicle\n2)Triangle\n3)Rectangle\nEnter Shape number");

	int choice=sc.nextInt();
	switch(choice){
	case 1:
		System.out.print("Enter Redius : ");
		int r=sc.nextInt();
		Circle objOfCircle=new Circle(r);
		System.out.println("Area of Circle : "+objOfCircle.getArea());
		break;
	case 2:
		System.out.print("Enter Height : ");
		int h=sc.nextInt();
		System.out.print("Enter Base : ");
		int b=sc.nextInt();
		Triangle objOfTriangle=new Triangle(h,b);
		System.out.println("Area of Triangle : "+objOfTriangle.getArea());
		break;
	case 3:
		System.out.print("Enter Length : ");
		int l=sc.nextInt();
		System.out.print("Enter Width : ");
		int w=sc.nextInt();
		Rectangle objOfRectangle=new Rectangle(l,w);
		System.out.println("Area of Rectangle : "+objOfRectangle.getArea());
		break;
	default:
		System.out.println("Enter Right cohice");
	}
	System.out.println("Pares y for Contiune...");
	userIn=sc.next().charAt(0);

	//Clear Screen
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	while(userIn=='y');

	}

}