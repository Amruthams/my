/*3. Write a program has classes Publisher, Book, Literature and Fiction. Read theinformation and print the details of books from eitherthecategory, usinginheritanceClass Publisher- Attribute PublisherName, Method display()Class Book subclass of Publisher- Attribute- Title, Author, Method display()Class Literature subclass of Book-Attribute-type, Method display()Class Fiction subclass of Book-Attribute genre, Method display()*/

import java.util.*;
class Publisher
{
	String Pname;
	Publisher (String n) //constructor
	{
		Pname=n;
	}
	void dispaly()
	{
		System.out.println("Publisher name:" +Pname);
	}
}

class Book extends Publisher
{
	String title,author;
	Book(String n,String t,String a)
	{
		super(n);
		title=t;
		author=a;
	}
	void display()
	{
		super.dispaly();
		System.out.println("Book title:" +title);
		System.out.println("Author:" +author);
	}
}

class Literature extends Book
{
	String type;
	Literature(String n,String t,String a,String typ)
	{
		super(n,t,a);
		type=typ;
	}
	void dispaly()
	{
		super.dispaly();
		System.out.println("Type:"+type);
	}
}

class Fiction extends Book
{
	String genre;
	Fiction( String n,String t,String a,String r)
	{
		super(n,t,a);
		genre=r;
	}
	void display()
	{
		super.display();
		System.out.println("Genre:"+genre);
	}
}

class P3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of books of literature:");
		int n1=in.nextInt();

		System.out.println("Enter number of books in fiction:");
		int n2=in.nextInt();
		

	Book ref;  //reference variable
	Literature obj1[]=new Literature[n1];
	Fiction obj2[]=new Fiction[n2];
	int i=0;
	int j=0;

	do
	{
         	System.out.println("\n\nEnter Literature Book details  "+(i+1));

           	System.out.println("Enter Publisher name :  ");
           	String p=in.next();

           	System.out.println("Enter book name :  ");
           	String b=in.next();

           	System.out.println("Enter author name :  ");
           	String au=in.next();
            
           	System.out.println("Enter Literature type :  ");
           	String ty=in.next();

           	obj1[i]=new Literature(p,b,au,ty);
         	i++;
	}while(i<n1);

	do
	{
		System.out.println("\n\n Enter fiction book details" +(j+1));
	
		System.out.println("Enter Publisher name:");
		String p=in.next();

		System.out.println("Enter book name:");
		String b=in.next();

		System.out.println("Enter author name:");
		String au=in.next();

		System.out.println("Enter Fiction type:");
		String ty=in.next();

		obj2[j]=new Fiction(p,b,au,ty);
		j++;
	}while(j<n2);

	while(true)
	{
		System.out.println("\n\n1.Literature\n2.Fiction\n3.Exit\n\nEnter work type to show....\n");
		int ch=in.nextInt();
		switch(ch)
		{
			case 1:
           			for(i=0;i<n1;i++)
        			{
               				System.out.println("\n____Literature book information "+ (i+1)+"___\n");
               				obj1[i].display();
             			}
       				break;
        		case 2:
                  		for(j=0;j<n2;j++)
				{
               				System.out.println("\n____Fiction book information "+(j+1)+"___\n");
               				obj2[j].display();     
         			}
        			break;
    			case 3:System.exit(0);
      			default:System.out.println("invalid");
        
      		}

     	}
}
}	


/*
OUTPUT

Enter number of books of literature:
2
Enter number of books in fiction:
1


Enter Literature Book details  1
Enter Publisher name :  
Dc  
Enter book name :  
Emma
Enter author name :  
janeaustein
Enter Literature type :  
novel


Enter Literature Book details  2
Enter Publisher name :  
Dc
Enter book name :  
lordofthefiles
Enter author name :  
William
Enter Literature type :  
novel


 Enter fiction book details1
Enter Publisher name:
bazar
Enter book name:
Alchemist
Enter author name:
PauloCoehlo
Enter Fiction type:
novel


1.Literature
2.Fiction
3.Exit

Enter work type to show....

1

____Literature book information 1___

Publisher name:Dc
Book title:Emma
Author:janeaustein

____Literature book information 2___

Publisher name:Dc
Book title:lordofthefiles
Author:William


1.Literature
2.Fiction
3.Exit

Enter work type to show....

2

____Fiction book information 1___

Publisher name:bazar
Book title:Alchemist
Author:PauloCoehlo
Genre:novel


1.Literature
2.Fiction
3.Exit

Enter work type to show....

3
*/

