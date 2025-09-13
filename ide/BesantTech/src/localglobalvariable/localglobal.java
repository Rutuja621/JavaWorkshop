package localglobalvariable;

public  class localglobal {
	int a=10;//global variable accessible in same class
    public void  m1() {
    	System.out.println(a);
    }
    
    public void m2() {
    	System.out.println(a);
    	//System.out.println(b);
    }
    
    public void m3() {
    	int b=3;//local variable accessible within the function
    	System.out.println(b);
    }
                     //local variable
    public void m4(int c) {
    	System.out.println(c);
    }
    
  
}
