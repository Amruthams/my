//Add two complex numbers

import java.util.Scanner;
class Complex
{
	int r;
	int i;

	Complex(int a,int b)	//to initialise
	{
		r=a;
		i=b;
	}
	public static void main(String arg[])
	{
		int c;
		int d;
		Scanner in=new Scanner(System.in);		
		

		System.out.println("Enter Real and Imaginary Part of First Complex Number: "); //reading first


		
		int x=in.nextInt();
		int y=in.nextInt();
		Complex obj1=new Complex(x,y);
		System.out.println("Enter Real and Imaginary Part of Second Complex Number: ");  //reading second


		
		int p=in.nextInt();
		int q=in.nextInt();
		Complex obj2=new Complex(p,q); 
		c=obj1.r+obj2.r;  //adding real part
		d=obj1.i+obj2.i;  //adding img part

		
		System.out.println("Sum of complex numbers: "+c+"+i"+d);


	}
}




/*OUTPUT


Enter Real and Imaginary Part of First Complex Number: 
2 5
Enter Real and Imaginary Part of Second Complex Number: 
3 4
Sum of complex numbers: 5+i9

*/
