package Polymorpshism;

public class Childclass extends Parentclass{  
	
	public  void d1(int a) {
		System.out.println("Method overiding of  child class");
	}
	  public static void main(String[] args) { 
	/*	  Parentclass pobj=new  Childclass();
		  pobj.d1();  
		  Parentclass pob=new Parentclass();
		  pob.d1(); 
		  Childclass cobj=new Childclass();  //jiska obj hai wohi method run hogi compiler suggest karega objref
		  cobj.d1(); 
		//  Childclass cob=new Parentclass(); //parent class can not have access of child class
		 // cob.d1();   
		  * */
		  Parentclass obj=new Childclass();
		  obj.d1();
		  
		  
		  
	}
	
		
		
		
		
		
	}


