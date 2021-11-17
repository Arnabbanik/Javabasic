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
		  

			//Primitive -> Object = AutoBoxing
			//Object -> Primitive = Unboxing
			//Primitive -> String
		    //String -> Primitive
			//Object -> String
			//String -> Object
			
			//methods ->
			//valueOf -> autoboxing
			//intValue -> unboxing
			//toString -> Object to String
			//parseLong -> String to Object
			//toString -> Primitive to String
			//parseInt -> autoboxing -> String to primitive
			
			//explicit Primitive -> Object
			int a1 = 23;
			Integer b1 = Integer.valueOf(a1);
			
			System.out.println(b1);
	
			//explicit Object -> Primitive
			Integer b2 = new Integer(12);
			int a2 = b2.intValue();
			
			System.out.println(a2);
			
			//toString -> Object to String
			long l = 200000000;
			Long L = new Long(l);
			
			String s = L.toString();
			System.out.println(s);
			
			//String -> Object
			String s1 = "20";
		    Integer a3 = Integer.valueOf(s1);
		    int a4 = Integer.parseInt(s1);
		    int a5 = a3+a4;
		    System.out.println(a5);
			
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