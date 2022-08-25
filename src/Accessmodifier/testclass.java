package Accessmodifier;

public class testclass extends Modifier   { 
	public void d2() {
		System.out.println("Method of child class"); 
		
		System.out.println(super.a);  
		d1();
		
	}
 
	public static void main(String[] args) {   
		Modifier mo=new Modifier(); 
		
		
		 
		mo.d1(); 
		System.out.println(mo.a);
			
		
	}
}
