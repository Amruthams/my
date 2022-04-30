/*
3. Write a program to illustrate the following String manipulation
methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
*/

class StrManipulation
{
	public static void main(String args[])
	{
	//new string using new
	char chs[]={'w','e','l','c','o','m','e'};
	String newStr = new String(chs);
	System.out.println("New string from char[] using new string: "+newStr);

	byte asciis[]={65,66,67,68,69,70};
	newStr = new String(asciis);
	System.out.println("New string from byte[] using new string: "+newStr);

	String s1 = "good";
	String s2 = "morning";
	//string length
	System.out.println("String length of 'good': "+ s1.length() +"\n");

	//to uppercase and lowercase
	System.out.println("------ String Case Conversion-------");
	System.out.println(s1 + " to uppercase: "+ s1.toUpperCase());
	System.out.println(s2 + " to lowercase: "+ s2.toLowerCase());

	//string concatenation
	System.out.println("\n");
	System.out.println("-------String Concatenation-------");
	System.out.println("Using concat(): "+ s1.concat(s2));
	System.out.println("Using + operator: "+ s1 + s2);

	//character extraction
	System.out.println("\n");
	System.out.println("--------Character Extraction-------");
	System.out.println("Character at 3rd position: "+ s1.charAt(3));
	char c[] = new char[5];
	s1.getChars(2,4,c,0);
	System.out.println("Character between 2 and 4 : "+ new String(c));

	//character comparison
	System.out.println("\n");
	System.out.println("----------Character Comparison----------");
	s1 = "welcome";
	s2 = "WELCOME";
	System.out.println(s1 + " Equals " + s2 + " : " + s1.equals(s2));
	System.out.println(s1 + " equalsIgnoreCase " + s2 + " : " + s1.equalsIgnoreCase(s2) );

	System.out.println(s1 + " compareTo " + s2 + " : " + s1.compareTo(s2));
	System.out.println(s1 + " compareToIgnoreCase " + s2 + " : " + s1.compareToIgnoreCase(s2) );

	System.out.println(s1 + " startsWith w : " + s1.startsWith("w"));
	System.out.println(s1 + " endsWith x: " + s1.endsWith("x") );

	//Searching substrings
	System.out.println("\n");
	System.out.println("----------Searching substrings----------");
	String s3 = "who are you" ;	
	System.out.println(" first occurrence of a substring 'are' in the string " + s3 + " is : " +  s3.indexOf('are') );
	System.out.println(" last occurrence of a substring 'are' in the string " + s3 + " is : " +  s3.lastIndexOf('e') );

	//Modifying a string
	System.out.println("\n");
	System.out.println("----------Modifying a string---------");
	String s4 = " welcome to java programming lab " ;
	System.out.println(" Substring of the string " + s4 + " is : " +  s4.substring(11,28) );
	System.out.println(" 'java' in the string " + s4 + " is replaced by : " +  s4.replace("java","oop") );

	//Data conversion using valueOf()
	System.out.println("\n");
	System.out.println("----------Data conversion using valueOf()---------");
	int s5 = 50;
	System.out.println("Data conversion " + s5 + " is : " +  String.valueOf(s5) );
	
	
	}
}



/*
OUTPUT

New string from char[] using new string: welcome
New string from byte[] using new string: ABCDEF
String length of 'good': 4

------ String Case Conversion-------
good to uppercase: GOOD
morning to lowercase: morning


-------String Concatenation-------
Using concat(): goodmorning
Using + operator: goodmorning


--------Character Extraction-------
Character at 3rd position: d
Character between 2 and 4 : od


----------Character Comparison----------
welcome Equals WELCOME : false
welcome equalsIgnoreCase WELCOME : true
welcome compareTo WELCOME : 32
welcome compareToIgnoreCase WELCOME : 0
welcome startsWith w : true
welcome endsWith x: false


----------Searching substrings----------
 first occurrence of a substring 'are' in the string who are you is : 4
 last occurrence of a substring 'are' in the string who are you is : 6


----------Modifying a string---------
 Substring of the string  welcome to java programming lab  is :  java programming
 'java' in the string  welcome to java programming lab  is replaced by :  welcome to oop programming lab 


----------Data conversion using valueOf()---------
Data conversion 50 is : 50

*/
