package Calculation;

public class Sum {
    private int a;
    private int b;//instance objectname.variblename
    
    //setter and getter
    public void setA(int a) {
    	this.a = a;
    }
    public int getA() {
    	return a;
    }
    public void setB(int b) {
    	this.b = b;
    }
    public int getB() {
    	return b;
    }
     
    //constructor
    public Sum(int a,int b) {
    	this.a=a;
    	this.b=b;
    }

    
    //default constructor
    public Sum() {
    	
    }
    //method
    public int summation() {
    	return a+b; 
    }
    
}
