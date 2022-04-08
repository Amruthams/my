//2. d)binary search using biSearch()



import java.util.*;   
class Bisearch
{
     	public static void main(String args[])
	{
            	Scanner in=new Scanner(System.in);
            	int i,k=0;
            
            	System.out.println("Enter Number of elements: ");
             	int n=in.nextInt();
            	int arr[]=new int[n];//declaring array
             	System.out.println("Enter the elements in sorted order: ");
            	for( i=0;i<n;i++)
            	{
              		arr[i]=in.nextInt();  //reading values
             	}
             	System.out.println("Enter the element to search: ");
             	int s=in.nextInt();

         	

           	int z=Arrays.binarySearch(arr,s);   //invoking binarySearch()

          	if(z> -1)  
            	System.out.println("The Element Found at Index:  "+z);
          	else//not found case
             	System.out.println("The Element Not Found   ");            



	}
}



/* OUTPUT

case1:

Enter Number of elements: 
5
Enter the elements in sorted order: 
1
2
3
4
5
Enter the element to search: 
3
The Element Found at Index:  2

case2:


Enter Number of elements: 
3
Enter the elements in sorted order: 
1
2
3
Enter the element to search: 
7
The Element Not Found  


*/ 
