package Casting;

public class Child1  extends Parent{ 
	public void d2() {
		System.out.println("method 2 of child class ");
	}

	public static void main(String[] args) { 
		Parent objch=new Parent();  
		try {
		
		  child newobj=(child)objch ; 
		  newobj.d1();
		  newobj.d2();
		  newobj.d3(); 
		}
		
		catch (ClassCastException ref){ 
			System.out.println("exception" +ref.getMessage());
		} 
		
		  
	
		
		
		
		
		

	}

}
