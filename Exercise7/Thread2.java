/*4. Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)*/

class Fib implements Runnable          //implementing runnable interface
{
       	Scanner s=new Scanner(System.in);
      	int n;
       	Fib(int k)		//constructor
	{
          n=k;  
        }
     	public void run()
     	{
            
              	System.out.println("\n__Fibonacci series upto "+n+" terms___\n\n");           
             	int a=0,b=1,c=0;
         
             	for(int i=1;i<=n;i++)
             	{                  
                	System.out.println("Fibonacci : "+c);              
               		a=b;
               		b=c;
               		c=a+b;
    		}
         
     	}
}


class Even implements Runnable
{
	int n1,n2;
	Even(int a,int b)	//constructor
	{
		n1=a;
		n2=b;
	}
	public void run()
	{
		for(int i=n1;i<=n2;i++)
             	{
                  
                	if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
            	} 
	}
}



public class Thread2
{
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);

             	System.out.println("\n\nEnter Limit for fibonacci series:");
             	int n=in.nextInt();

		System.out.println("\nEnter the range of even numbers:");
		int n1=in.nextInt();
		int n2=in.nextInt();

		Fib r1 = new Fib();
		Thread t1 = new Thread(r1);  
		t1.start();
		
		Even r2 = new Even();
		Thread t2 = new Thread(r2);  
		t2.start();
	}
}
