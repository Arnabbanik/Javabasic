package Calculation;
import java.util.*;
public class Main{

	//static block
	//static method
	//static variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter a: ");
		  int a = sc.nextInt();
		  
		  System.out.println("Enter b: ");
		  int b = sc.nextInt();
		  
		  System.out.println("Enter c: ");
		  int c = sc.nextInt();
//		  Sum cal = new Sum(a,b);
		  /*
		  cal.setA(a);
		  cal.setB(b);
		  */
		  
		  //static - class level(common for all obj)
		  //non static - object level
		  
		  
		  Summation cal = new Summation(a,b,c);
		  
		  Summation cal1 = new Summation();
		  
		  System.out.println(cal.mainsum());
		  System.out.println(cal.summation());
		  
		  Main.display();
//		  System.out.println(cal.summation());
//		  System.out.println(cal.getA());
//          System.out.println(cal.getB());
	}
	static void display() {
		System.out.println("Inside method");
	}
	static {
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Hello1");
	}

}
