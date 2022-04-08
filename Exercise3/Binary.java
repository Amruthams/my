//2. b) simple binary search 


import java.util.Scanner;
class Binary
{
	public static void main(String args[])
	{
        	Scanner s=new Scanner(System.in);
                int i,k=0;
            
            	System.out.print("Enter Number of elements: ");
             	int n=s.nextInt();
            	int arr[]=new int[n];//declaring array
               
             	System.out.println("Enter the elements in sorted order: ");
            	for( i=0;i<n;i++)
            	{
              		arr[i]=s.nextInt(); //reading values
             	}
             	System.out.print("Enter the element to search: ");
             	int search=s.nextInt();

              
           
             	int f=0,l=n-1,mid=(f+l)/2;
            	while(f<=l)
             	{
              		if(search>arr[mid])  //case of element is right of mid
               		{
                 		f=mid+1;
                 		mid=(f+l)/2;
                	}
               		else if(search<arr[mid])  //case of element is left of mid
              		{
                 		l=mid-1;
                 		mid=(f+l)/2;
                 
               		}
             		else//case of match
              		{
              			 System.out.println(search + " is found at the index position "+mid);
             			 k=1;
                		break;
          		}
		 }
             if(k==0)
             {
               System.out.println(search + " not found ");
              }
           
}
}



/* OUTPUT

case1:

Enter Number of elements: 7
Enter the elements in sorted order: 
3
4
5
6
7
8
9
Enter the element to search: 6
6 is found at the index position 3



case2:

Enter Number of elements: 6
Enter the elements in sorted order: 
2
3
5
6
7
8
Enter the element to search: 4
4 not found 


*/
