package Calculation;

public class Summation extends Sum{

	private int c;

    static int d=10;//static classname.variblename
	
    {
    	System.out.println("Hello nonstatic");
    }
    
    
	public Summation(int a,int b,int c) {
	    super(a,b);
	    this.c = c;
	    
	}
	public Summation() {
		
	}
	public int mainsum() {
		int s = super.summation();
		return s+c+d;
	}

}
