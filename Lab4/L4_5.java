import java.util.Scanner;
class ArithmeticIntOp
{
	int calculate(int no1,int no2,char op)
	{
		if(op == '+')
		{
			return no1+no2;
		}
		else if(op == '-')
		{
			return no1-no2;
		}
		else if(op == '*')
		{
			return no1*no2;
		}
		else if(op == '/')
		{
			return no1/no2;
		}
		else
		{
			return 0;
		}
	}
	float calculate(float no1,float no2,char op)
	{
		if(op == '+')
		{
			return no1+no2;
		}
		else if(op == '-')
		{
			return no1-no2;
		}
		else if(op == '*')
		{
			return no1*no2;
		}
		else if(op == '/')
		{
			return no1/no2;
		}
		else
		{
			return 0;
		}
	}
}
class RelationalOp
{
	boolean result;
	RelationalOp()
	{
		result=false;
	}
	boolean getRelationalOpResult()
	{
		return result;
	}
	void calculate(int a,int b,String op)
	{
	if(op.equals("=="))
	{
		result = (a == b) ? true : false;
	}
	else if(op.equals("!="))
	{
		result = (a != b) ? true : false;
	}
	else if(op.equals(">"))
	{
		result = (a > b) ? true : false;
	}
	else if(op.equals("<"))
	{
		result = (a < b) ? true : false;
	}
	else if(op.equals(">="))
	{
		result = (a >= b) ? true : false;
	}
	else if(op.equals("<="))
	{
		result = (a <= b) ? true : false;
	}
}
void calculate(float a,float b,String op)
{
	if(op.equals("=="))
	{
		result = (a == b) ? true : false;
	}
	else if(op.equals("!="))
	{
		result = (a != b) ? true : false;
	}
	else if(op.equals(">"))
	{
		result = (a > b) ? true : false;
	}
	else if(op.equals("<"))
	{
		result = (a < b) ? true : false;
	}
	else if(op.equals(">="))
	{
		result = (a >= b) ? true : false;
	}
	else if(op.equals("<="))
	{
		result = (a <= b) ? true : false;
	}
	}
}
class BitwiseOp
{
	int result;
	BitwiseOp()
	{
		result=0;
	}
	int getBitwiseOpResult()
	{
		return result;
	}
	void calculate(int a,String op)
	{
	if(op.equals("~"))
	{
		result = ~(a);
	}
}
void calculate(int a,int b,String op)
{
	if(op.equals("&"))
	{
		result = (a & b);
	}
	else if(op.equals("|"))
	{
		result = (a | b);
	}
	else if(op.equals("^"))
	{
		result = (a ^ b);
	}
	else if(op.equals("~"))
	{
		result = ~(a);
	}
	else if(op.equals("<<"))
	{
		result = (a << b);
	}
	else if(op.equals(">>"))
	{
		result = (a >> b);
	}
	else if(op.equals(">>>"))
	{
		result = (a >>> b);
	}
}
}
class Lab4_5
{
	public static void main(String args[])
	{
	char ch='Y',opt,op;
	String op1="";
	int no1=0,no2=0;
	float fno1=0,fno2=0;
	Scanner sc=new Scanner(System.in);
	do
	{
	System.out.println("1.Arithmetic Operator");
	System.out.println("2.Relational Operator");
	System.out.println("3.Bitwise Operator");
	System.out.println("Enter your choice: ");
	opt=sc.next().charAt(0);
	switch(opt)
	{
		case '1':
		ArithmeticIntOp a1=new ArithmeticIntOp();
		System.out.println("Enter the integer no1 & no2:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		System.out.println("Enter the float no1 & no2:");
		fno1=sc.nextFloat();
		fno2=sc.nextFloat();
		System.out.println("Enter the op [+,-,*,/]:");
		op=sc.next().charAt(0);
		System.out.println("INTERGER =: "+no1+" "+op+" "+no2+" = "+a1.calculate(no1,no2,op));
		System.out.println("FLOAT =: "+fno1+" "+op+" "+fno2+" = "+a1.calculate(fno1,fno2,op));
		break;
		case '2':
		RelationalOp r1=new RelationalOp();
		System.out.println("Enter the no1 & no2:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		System.out.println("Enter the float no1 & no2:");
		fno1=sc.nextFloat();
		fno2=sc.nextFloat();
		System.out.println("Enter the op from this [==,!=,>,<,>=,<=]:");
		op1=sc.next();
		r1.calculate(no1,no2,op1);
		System.out.println("INTERGER:= "+no1+" "+op1+" "+no2+"="+r1.getRelationalOpResult());
		r1.calculate(fno1,fno2,op1);
		System.out.println("FLOAT:= "+fno1+" "+op1+" "+fno2+"="+r1.getRelationalOpResult());
		break;
		case '3':
		BitwiseOp b1=new BitwiseOp();
		System.out.println("Enter the no1 & no2:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		System.out.println("Enter the op from this [&,|,^,~,>>,<<,>>>]:");
		op1=sc.next();
		if(op1 == "~")
		{
			b1.calculate(no1,op1);
			System.out.println(no1+" "+op1+"="+b1.getBitwiseOpResult());
		}
		else
		{
			b1.calculate(no1,no2,op1);
			System.out.println(no1+" "+op1+" "+no2+"="+b1.getBitwiseOpResult());
		}
		break;
		default:
		System.out.println("Please Enter the proper choice");
		ch='Y';
		break;
	}
	System.out.println("Are you continue [y/n]: ");
	ch=sc.next().charAt(0);
	}while(ch == 'Y' || ch == 'y');
}
}