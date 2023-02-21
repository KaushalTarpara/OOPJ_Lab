import java.util.Scanner;


class ArithmeticIntOp{
	int result;
	ArithmeticIntOp(){
		result=0;
	}
	int getArithmethicIntOpResult(){

		return	result ;
	}
	void calculate(int a,int b,char op){

		switch(op){
		case '+':
			result=a+b;
			break;
		case '-':
					result=a-b;
					break;
		case '*':
					result=a*b;
					break;
		case '/':
					result=a/b;
					break;
		case '%':
					result=a%b;
					break;
		default:
		 	System.out.println("Please Enter Right Arithmentic Op");
		}
		
	}
}


class RelationalOp{
	boolean result;
	RelationalOp(){
		result=false;
	}
	boolean RelationalOpResult(){

		return	result ;
	}
	void calculate(int a,int b,String op){

		switch(op){
		case "==":
				result=a==b;
				break;
		case "<=":
					result=a<=b;
					break;
		case ">=":
					result=a>=b;
					break;
		case "<":
					result=a<b;
					break;
		case ">":
					result=a>b;
					break;
		case "!=":
					result=a!=b;
					break;

		default:
		 	System.out.println("Please Enter Right Relational Op");
		}
	}
}

class BitwiseOp{
	int result;
	BitwiseOp(){
		result=0;
	}
	int BitwiseOpResult(){

		return	result ;
	}
	void calculate(int a,int b,String op){

		switch(op){
		case ">>>":
				result=a>>>b;
				break;
		case ">>":
					result=a>>b;
					break;
		case "<<":
					result=a<<b;
					break;
		case "&":
					result=a&b;
					break;
		case "^":
					result=a^b;
					break;
		case "|":
					result=a|b;
					break;

		default:
		 	System.out.println("Please Enter Right Bitwise Op");
		}
	}
}

class L4_5{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char con;


		do{
		System.out.println("1) Arithmetihc op");
		System.out.println("2) Relational op");
		System.out.println("3) Bitwise op");
		System.out.println("4) Exit");

		System.out.println("Enter Your choice :");
		int c=sc.nextInt();

		System.out.print("Enter Int A :");
		int a=sc.nextInt();
		System.out.print("Enter Int B :");
		int b=sc.nextInt();

		System.out.print("Enter float A :");
		float fa=sc.nextFloat();
		System.out.print("Enter float B :");
		float fb=sc.nextFloat();


		switch(c){
			case 1:
				ArithmeticIntOp Aop=new ArithmeticIntOp();
				System.out.println("Enter Oparation (+,-,*,/,%):");
				char op=sc.next().charAt(0);
				Aop.calculate(a,b,op);
				System.out.println("Interger "+a+" "+op+" "+b+" = "+Aop.getArithmethicIntOpResult());
				Aop.calculate(fa,fb,op);
				System.out.println("Float "+fa+" "+op+" "+fb+" = "+Aop.getArithmethicIntOpResult());

				break;

			case 2:
				RelationalOp Rop=new RelationalOp();
				System.out.println("Enter Oparation (==,>,<,>=,<=,!=):");
				String rop=sc.next();
				Rop.calculate(a,b,rop);
				System.out.println(a+" "+rop+" "+b+" = "+Rop.RelationalOpResult());
				break;
			case 3:
				BitwiseOp Bop=new BitwiseOp();
				System.out.println("Enter Oparation (<<<,>>,<<,&,|,^):");
				String bop=sc.next();
				Bop.calculate(a,b,bop);
				System.out.println(a+" "+bop+" "+b+" = "+Bop.BitwiseOpResult());
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please enter Right choice");
		}
		System.out.println("Prass Y to continue...");
	    con=sc.next().charAt(0);

		}while(con=='y');


	}
}