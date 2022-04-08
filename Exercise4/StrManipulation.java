

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


	}
}
