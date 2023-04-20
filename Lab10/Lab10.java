import java.sql.*;
import java.util.*;
class Lab10
{
	public static void main(String args[])throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Connection con=null;
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/empDB";
			con = DriverManager.getConnection (url, "root","root");
			
            String qsIns="insert into emp(empid,name,dept,salary) values(?,?,?,?)";
			System.out.println("*************Insert Employee Details************");
			
            PreparedStatement pstIns= con.prepareStatement(qsIns);
			System.out.print("Enter Employee Id:");
			int id=sc.nextInt();
			pstIns.setInt(1,id);
			System.out.print("Enter Employee Name:");
			String nm=sc1.next();
			pstIns.setString(2,nm);
			System.out.print("Enter Employee Department:");
			String dep=sc1.next();
			pstIns.setString(3,dep);
			System.out.print("Enter Employee Salary:");
			Double sal=sc.nextDouble();
			pstIns.setDouble(4,sal);
			int i=pstIns.executeUpdate();
			System.out.println("inserted row "+i);
			System.out.println("**********************************");
			
            String qsU="update emp set name=? where empid=?";
			System.out.println("************Update Employee Details***********");
			PreparedStatement pstU= con.prepareStatement(qsU);
			System.out.print("Enter Id which name you want to update:");
			int idU=sc.nextInt();
			pstU.setInt(2,idU);
			System.out.print("Enter new Name:");
			String nmU=sc1.next();
			pstU.setString(1,nmU);
			System.out.println("Uptated row "+pstU.executeUpdate()+"................");
			
            String qsD="delete from emp where empid=?";
			System.out.println("-----------------------------------");
			System.out.println("***************Delete Employee Details**************");
			PreparedStatement pstD= con.prepareStatement(qsD);
			System.out.print("Enter Id which name you want to Delete:");
			int idD=sc.nextInt();
			pstD.setInt(1,idD);
			System.out.println("Deleted row "+pstD.executeUpdate()+"................");
			
            System.out.println("--------------------------------------");
			
            
            
            Statement smntMax= con.createStatement( );
			String qsMax="select * from emp where salary in ( select max(salary) from emp);";
			ResultSet resMax=smntMax.executeQuery(qsMax);
			boolean moreMax=resMax.next();
			System.out.println("***********Employee Details[Maximum Salary]*************");
			System.out.println("EmpId\tName\tDepartment\tSalary ");
			while(moreMax)
			{
				System.out.printf("%5d|",resMax.getInt( 1 ));
				System.out.printf("%10s|",resMax.getString( 2 ));
				System.out.printf("%10s|",resMax.getString( 3 ));
				System.out.printf("%10s|",resMax.getString( 4 ));
				System.out.println("");
				moreMax= resMax.next();
			}
			System.out.println("--------------------------------------");
			Statement smntMin= con.createStatement( );
			String qsMin="select * from emp where salary in ( select min(salary) from emp);";
			ResultSet resMin=smntMin.executeQuery(qsMin);
			boolean moreMin=resMin.next();
			
            System.out.println("-------------Employee Details[Minimum Salary]-------------");
			System.out.println("EmpId\tName\tDepartment\tSalary ");
			while(moreMin)
			{
				System.out.printf("%5d|",resMin.getInt( 1 ));
				System.out.printf("%10s|",resMin.getString( 2 ));
				System.out.printf("%10s|",resMin.getString( 3 ));
				System.out.printf("%10s|",resMin.getString( 4 ));
				System.out.println("");
				moreMin= resMin.next();
			}
			System.out.println("-----------------------------");
			
            Statement smntDis= con.createStatement( );
			String qsDis="select * from emp order by dept desc";
			ResultSet resDis=smntDis.executeQuery(qsDis);
			boolean moreDis=resDis.next();
			
            System.out.println("************Employee Details[Group By department]*************");
			System.out.println("EmpId\tName\tDepartment\tSalary ");
			while(moreDis)
			{
				System.out.printf("%5d|",resDis.getInt( 1 ));
				System.out.printf("%10s|",resDis.getString( 2 ));
				System.out.printf("%10s|",resDis.getString( 3 ));
				System.out.printf("%10s|",resDis.getString( 4 ));
				System.out.println("");
				moreDis= resDis.next();
			}
	        System.out.println("************************");
		}
		catch ( Exception ex)
		{
			System.out.println( "Error on data select" +ex);
			ex.printStackTrace();
		}
		finally
		{
			con.close();
		}
	}
}
