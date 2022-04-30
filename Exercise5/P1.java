/*Create a class ‘Employee’ with data members Empid,Name, Salary, Address and constructors to initialize thedata members. Create another class ‘Teacher’ that inheritthe properties of class employee and contain its own datamembers department, Subjects taught and constructorsto initialize these data members and also include displayfunction to display all the data members. Use array ofobjects to display details of N teachers.*/

import java.util.*;
class Employee
{
	int Empid;
	String Name;
	String Address;
	float Salary;

	Employee(int id,String na,String ad,float sal)
	{
		Empid=id;
		Name=na;		
		Address=ad;
		Salary=sal;
	}
	Employee()
	{

	}
}

class Teacher extends Employee
{
	String Department,Subject;

	Teacher(int id,String na,String ad,float sal,String dpt,String sub)
	{
		Empid=id;
		Name=na;		
		Address=ad;
		Salary=sal;
		Department=dpt;
		Subject=sub;
	}
	

	void display(int i)
	{
		
		System.out.println("\nDetails of teacher no : " + (i+1));
		System.out.println("Employee id= " + Empid);
		System.out.println("Employee Name= " + Name);		
		System.out.println("Address= " + Address);
		System.out.println("Salary= " + Salary );
		System.out.println("Department= " + Department);
		System.out.println("Subject= " + Subject);
		
	}
}

class P1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of teachers: ");
		int n =in.nextInt();
		
		Teacher obj[]=new Teacher[n];   
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of teacher no : " + (i+1));

			System.out.println("Enter employee id : ");
			int id=in.nextInt();

			System.out.println("Enter employee name : ");
			String na=in.next();

			System.out.println("Enter employee address : ");
			String ad=in.next();

			System.out.println("Enter employee salary : ");
			float sal=in.nextFloat();

			System.out.println("Enter employee department : ");
			String dpt=in.next();

			System.out.println("Enter employee subject : ");
			String sub=in.next();
			
			System.out.println("-----------------------\n");

			obj[i] = new Teacher(id,na,ad,sal,dpt,sub);
			
		}
		System.out.println("DETAILS OF EMPLOYEE\n");
		for(int i=0;i<n;i++)
		{
			obj[i].display(i);
		}
	}
}



/*
OUTPUT

Enter the number of teachers: 
2
Enter details of teacher no : 1
Enter employee id : 
101
Enter employee name : 
Amrutha
Enter employee address : 
Madhuchirayil
Enter employee salary : 
250000
Enter employee department : 
mca
Enter employee subject : 
java
-----------------------

Enter details of teacher no : 2
Enter employee id : 
102
Enter employee name : 
Saranya
Enter employee address : 
Kalarikkal
Enter employee salary : 
50000
Enter employee department : 
Mba
Enter employee subject : 
Bussiness
-----------------------

DETAILS OF EMPLOYEE


Details of teacher no : 1
Employee id= 101
Employee Name= Amrutha
Address= Madhuchirayil
Salary= 250000.0
Department= mca
Subject= java

Details of teacher no : 2
Employee id= 102
Employee Name= Saranya
Address= Kalarikkal
Salary= 50000.0
Department= Mba
Subject= Bussiness

*/
