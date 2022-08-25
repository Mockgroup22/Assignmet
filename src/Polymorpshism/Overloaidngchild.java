package Polymorpshism;

public class Overloaidngchild extends Overloadingparent { 
	
	public void d1(int a) {
		System.out.println("Method of child class");
	} 
	public static void main(String[] args) { 
		Overloaidngchild cobj=new Overloaidngchild();
		cobj.d1(0);  
	//	Overloaidngchild cobj1=new Overloadingparent();
	//	cobj1.d1(0);
		
		Overloadingparent pobj=new Overloaidngchild();  //compiler obj reff suggest karega wohi chalega
		pobj.d1();  
		
		Overloadingparent pobj1=new Overloadingparent(); 
		pobj1.d1();
		
		
	}
	
	

}
