package Inheritance1;

public class Child extends Parent{   
	static int a=20;
	
	public void d1() { 
		
		System.out.println(Parent.a);
		
	}
	
	
	public static void main(String[] args) {  
		Child obj= new Child();
	       obj.d1();
	       obj.d2(); 
	        d3();  
	       
	        
	  
		
		
	}

	

}
