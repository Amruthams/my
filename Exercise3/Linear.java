/*2. a) linear search*/

import java.util.Scanner;
class Linear
{
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
            	int i,k=0;
		System.out.print("Enter Number of elements: ");
                int n=in.nextInt();
                int arr[]=new int[n];//declaring array
                System.out.print("Enter the elements: ");

                for( i=0;i<n;i++)
                {
                	arr[i]=in.nextInt();//reading values
                }

                System.out.print("Enter the element to search: ");
                int search=in.nextInt();

		for(i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				 System.out.println(search + " is present in index position  " +i);
				k=1;
				break;
			}
		}
		if(k==0)
		{
			System.out.println(search + " is not present"); 
		}
		
	}
}



/* OUTPUT

CASE1:

Enter Number of elements: 5
Enter the elements: 23
45
67
89
0
Enter the element to search: 5
5 is not present


CASE2:

Enter Number of elements: 3
Enter the elements: 1
2
3
Enter the element to search: 2
2 is present in index position  1


*/
		


