import java.util.*;
class Account
{
   String CustName,Branch,Type;
   int Acno;
   void getCustInfo()
   {
    
    Scanner sc1=new Scanner(System.in);
    
    System.out.println("Enter Customer Name");
    CustName=sc1.nextLine();
    System.out.println("Enter Branch");
    Branch=sc1.nextLine();
    System.out.println("Enter Accout NO");
    Acno=sc1.nextInt();
   
   }
   void displayinfo(){
    System.out.println("Customername=" + CustName);
    System.out.println("Type=" + Type);
    System.out.println("BranchName=" + Branch);
    System.out.println("Acount No=" + Acno );    
   }
}
class Savings extends Account
{
   double Amount,bal,interest;
   float rate;
   int  year;  
   Savings(String type){
    super.Type=type;
   } 
   void getSavinginfo()
   {
       super.getCustInfo();
       System.out.println("------------------------------"); 
       System.out.println("Saving Account details");    
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Amount");
       Amount=sc.nextDouble();
       System.out.println("Enter year");
       year=sc.nextInt();
       rate=3.5f;
    }
   void calIntAmt()
   {
       interest=(Amount*rate*year)/100;
       bal=Amount+interest;
   }
   void displayinfo()
   {       
       super.displayinfo();
       System.out.println("Amount=" +Amount);
       System.out.println("Rate =" + rate);
       System.out.println("Year =" +year);
       System.out.println("Interest=" + interest);
       System.out.println("Balance="+bal);
   }
}
class FixedDeposit extends Account
{
   double Amount,rate,interest,bal;
   double year;
   FixedDeposit(String type){
    super.Type=type;
   } 
  
   void getFDinfo()
   {
        super.getCustInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------------");       
        System.out.println("Fixed Account details");       
        System.out.println("Enter Amount");
        Amount=sc.nextDouble();
        System.out.println("Enter year");
        year=sc.nextDouble();
     
       if(year<=2)
       {
           rate=6.5;
       }
       else if(year>2 && year<=5)
       {
           rate=7.5;
       }
       else if(year>5 && year<8.5)
       {
           rate=8.5;
       }
       else
       {
           rate=9;
       }
   }
   void calIntAmt()
   {
       interest=(Amount*rate*year)/100;
       bal=Amount+interest;
   }
   void displayinfo()
   {
       super.displayinfo();
       System.out.println("Amount=" +Amount);
       System.out.println("Rate =" + rate);
       System.out.println("Year =" +year);
       System.out.println("Interest=" + interest);
       System.out.println("Balance="+bal);
   }
}
class L4_2
{
   public static void main(String a[])
   {
       
       Savings s1=new Savings("Savings");       
       s1.getSavinginfo();
       s1.calIntAmt();
       s1.displayinfo();
     
       FixedDeposit fd=new FixedDeposit("FixedDeposit");
       fd.getFDinfo();
       fd.calIntAmt();
       fd.displayinfo();
      
   }
}