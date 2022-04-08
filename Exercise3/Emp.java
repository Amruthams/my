/*Program to create a class for Employee having attributes eNo, eName
eSalary. Read n employ information and Search for an employee given
eNo, using the concept of Array of Objects.*/

import java.util.Scanner;
class Employee
{
	int eno,esal;
	String ename;
	void setdata(int a,String b,int c)	//to initialise variables
	{
		eno=a;
		ename=b;
		esal=c;
	}
}
class Emp
	{
     		public static void main(String args[])
		{
            		Scanner in=new Scanner(System.in);
           
            
            		System.out.print("Enter Number of Employees: ");
             		int n=in.nextInt();
            		Employee obj[]=new Employee[n];	//declaring an array of objects
          		for(int j=0;j<n;j++)	//to allocate memory for each objects
             		obj[j]=new Employee();
             		int a,f=0;
             		String b;
             		int c,i;
            		for(i=0;i<n;i++)
            		{
             			System.out.println("Enter Employee number,Employee name,Salary of person : "+(i+1));
             			a=in.nextInt();
             			b=in.next();
             			c=in.nextInt();
            	 		obj[i].setdata(a,b,c);	
             		}

                     

             		System.out.println("Enter person id to search: ");
             		int id=in.nextInt();

              
              		for(i=0;i<n;i++)
                	{
                  		if(id==obj[i].eno)	//comparing id's
                  		{
                   			System.out.println("Employee exist ");
                    			f=1;
                    			break;
                   		}
          
               		}
            		if(f==0)
               		System.out.println("Employee not found ");
		}
	}

/* OUTPUT

case1:
Enter Number of Employees: 2
Enter Employee number,Employee name,Salary of person : 1
1 shamna 200000 
Enter Employee number,Employee name,Salary of person : 2
2 localsaranya 200
Enter person id to search: 
2
Employee exist 

case2:

Enter Number of Employees: 2
Enter Employee number,Employee name,Salary of person : 1
1 shamna 200000
Enter Employee number,Employee name,Salary of person : 2
2 sharu 50000
Enter person id to search: 
4
Employee not found 

*/

