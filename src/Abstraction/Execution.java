package Abstraction;

import Interface1.Parent;

public class Execution  { 
	
	public static void main(String[] args) {
		Investment1 obj=new Investment1();
		obj.login();
		obj.lonterm();
		obj.shorterm();
		obj.logout(); 
		System.out.println(Parent.a);
		
	}

}
