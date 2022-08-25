package Casting;

public class child extends Parent  { 
	public void d3() {
		System.out.println("Method of child class");
	}

	public static void main(String[] args) { 
		Parent chobj=new child();
		chobj.d1();
		chobj.d2();
		
		Parent pobj =(Parent)chobj;//child class is type cast to parent class ,upcasting
		pobj.d1();
		pobj.d2();
		
		
	

	}

}
