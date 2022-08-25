package InheritanceVar;

import Inheritance1.Child;

public class Child1 extends Parent {   
	 int a=10;
	 static int c=12;
	 
	public void d1() { 
		System.out.println("value of child class"  +super.a);
		
		
		
	}
	;
	
	public static void main(String[] args) { 
		Child c=new Child();  
		c.d1();
	   Parent p=new Parent(); 
	   System.out.println("value of parent class:"  +p.a); 
	    
		System.out.println(c); 
		System.out.println(Parent.b);
		
	}
	
			
}

