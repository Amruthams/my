//5. Find the area of different shapes using overloaded functions


import java.util.*;
class Area 
{

	//overloading  method
	void area(int a,int b)
	{
		System.out.println("Area of Rectangle: "+(a*b));
	}
	void area(int x)
	{
		System.out.println("Area of Square: "+(x*x));
	}

	void area(float r,int i,int j)
	{
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	public static void main(String args[])
		{
            		Scanner in=new Scanner(System.in);		                        		
            		Area obj=new Area();		//creating object
           		System.out.println("1.Rectangle\n2.Square\n3.Circle\n\nEnter your Choice:  ");
           		int ch=in.nextInt();
           		int a,b,c,d,rad;
           		float ar;

         
        	//for menu driven


          	switch(ch)
          	{
          		 case 1:System.out.println("Enter length and breadth: ");
                  		a=in.nextInt();
                   		b=in.nextInt();
                   		obj.area(a,b);		//invoking area
                   		break;

            		case 2:System.out.println("Enter length : ");
                  		c=in.nextInt();
                   		obj.area(c);		//invoking area
                   		break;

            		case 3:System.out.println("Enter Radius : ");
                  		rad=in.nextInt();
                   		obj.area(rad,0,0);		//invoking area                    
                  		break;
           		default:System.out.println("Invalid input");
                     		break;
           	}


		}
}
