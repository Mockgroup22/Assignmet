package Inheritance;

public class child extends Parent {  
	
	public void m4() { 
		System.out.println("M4 is present in method4");
		
	}
	 
	public static void main(String[] args) {   
		child obj = new child(); 
		obj.m1();
		obj.m2(); 
		m3();
		
		
		
	}

}
