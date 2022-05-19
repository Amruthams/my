/*3. Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)*/

import java.util.*;

class multi extends Thread        //inheriting
{
	public void run()
     	{            
               	System.out.println("multiplication table of 5\n\n");           

             	for(int i=1;i<=10;i++)
             	{
                	System.out.println(i + "*" + " 5 =" + (i*5));                                
              	}
         
     	}
}

class prime extends Thread   	//extending     
{

   	int n;
 
   	prime(int k)          //constructor
	{
       		n=k;
 	}


 	public void run()
     	{
       
              	int flag=0;
             	Scanner in=new Scanner(System.in);             
             	System.out.println("Prime numbers upto "+ n+"\n\n");
             	for(int i=2;i<=n;i++)
             	{   
			flag=0;
                	for(int j=2;j<=(i/2);j++)
                	{
                     		if((i%j)==0)
				{
					flag=1;
					break;
				}
                 	}
               		if(flag==0)
			{
				System.out.println("Prime Number : "+i);
			}
              }

     	}

}


public class Thread1 
{
    	public static void main(String args[])
    	{
         	Scanner in=new Scanner(System.in);         
     		System.out.println("\nEnter Limt:");
             	int n=in.nextInt();
     		multi obj1=new multi(); 
		obj1.start();               
     		prime obj2=new prime(n);         
		obj2.start();                     
      
   	}
}

