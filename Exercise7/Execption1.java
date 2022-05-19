/* 1. Write a user defined exception class to authenticate the user name and password.*/


import java.util.*;

class myException extends Exception
{
	public myException(String s)
	{
		super(s);
	}
}
	

class Execption1
{
   	public static void main(String ar[])
    	{
       		String username="Amrutha";
       		String password="qwerty";
       		Scanner in = new Scanner(System.in);
       		System.out.print("Enter Username:");
       		String u=in.next();
       		System.out.print("Enter Password:");
       		String p=in.next();
  		try
    		{
     			if((u.equals(username)) && (p.equals(password)))
			{
     			System.out.print("Authentication success\n");
    			}
  			else
   			{
     				throw new myException("Authentication Faild");
   			}
   		}

  		catch(myException ex)
   		{
    			System.out.print(ex.getMessage()+"\n");
   		}
  	}
}




/*
OUTPUT

case1:

Enter Username:Amrutha
Enter Password:qwerty
Authentication success


case2:

Enter Username:qwerty
Enter Password:qwerty
Authentication Faild

*/
