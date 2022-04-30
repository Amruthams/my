/*1. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.*/


import java.util.*;

class Cpu
{

	float price=10000;
     	void display()
     {
       	System.out.println("Price: "+price);
       	processor p=new processor();    //creating object for inner class
       	p.display();
     }


class processor
{
	int core=5;
	String man="AMD";
     	void display()
     	{
       		System.out.println("Number of cores: "+core);
       		System.out.println("CPU Manufacturer: "+man);
     	}

}

static class ram  //static inner class
{
	int size=4;
	String manu="DELL";
    	void display()
    	{
     		System.out.println("RAM Size: "+size+ " GB");
     		System.out.println("RAM Manufacturer: "+manu);
    	}
}


public static void main(String args[])
{
	Cpu obj=new Cpu();   //creating object of outer class
	System.out.println("System information");
	
	obj.display();
	Cpu.ram obj2=new Cpu.ram();	//creating object for static inner class
	obj2.display();
}
}



/*OUTPUT

System information
Price: 10000.0
Number of cores: 5
CPU Manufacturer: AMD
RAM Size: 4 GB
RAM Manufacturer: DELL


*/

