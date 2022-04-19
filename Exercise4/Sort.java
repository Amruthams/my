//2. Write a menu driven program that would choose either in-built method or call a user defined method to sort an array of strings.


import java.util.*;

class user
{
	void user(int n)
	{

	//sorting an array
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareTo (arr[j])>0);  //compare
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}		


class Sort
{

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String arr[]=new String[50];
		System.out.println("Enter the number of elements in array :");
		int n=in.nextInt();
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt(); //reading elements from the user
		}
		
			


		do
    		{
        		System.out.print("\n\n1.IN-BUILT\n2.USER_DEFINED\n3.EXIT\nEnter your Choice:  ");
        		int c=in.nextInt();

        	}
	}
	
}
