//2. c)Recursive binary search

import java.util.Scanner;

class Recursivebinary
{
	int bisearch(int f,int l,int x,int arr[])//recursive fun
	{

		if(l>=f)
		{
			int mid=(f+l)/2;
			if(arr[mid]==x)  //case of match
			return mid;

			if(x>arr[mid])
			return bisearch(mid+1,l,x,arr);  //case of right side
			return bisearch(f,mid-1,x,arr);  //case of left side
		}
	return -1;	
	}



	public static void main(String args[])
	{
            
            
           	Recursivebinary obj=new Recursivebinary();
		Scanner in=new Scanner(System.in);
            	int i;
 		System.out.println("Enter Number of elements: ");
             	int n=in.nextInt();
           	int arr[]=new int[n];
               
            	 System.out.println("Enter the elements in sorted order : ");
           	 for( i=0;i<n;i++)
            	{
             		 arr[i]=in.nextInt();
            	}
             	System.out.println("Enter the element to search: ");
             	int s=in.nextInt();
           
           	int k=obj.bisearch(0,n-1,s,arr);//invoking bisearch
          	if(k==-1)
          	System.out.println("Element not found ");
          	else
           	System.out.println("Element found at index position "+k);
           
           
	}

}




/*OUTPUT

case1:
Enter Number of elements: 
6
Enter the elements in sorted order : 
1
2
3
4
5
6
Enter the element to search: 
2
Element found at index position 1


case2:

Enter Number of elements: 
5
Enter the elements in sorted order : 
1
2
3
4
5
Enter the element to search: 
6
Element not found 

*/

