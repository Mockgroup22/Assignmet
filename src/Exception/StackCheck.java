package Exception;

public class StackCheck { 
	public void m1() {
		System.out.println("Method of stack 1class");
		m2();
	} 
	
	public void m2() {
		System.out.println("Method of stack 2class"); 
		m1();
	}  
	public static void main(String[] args) { 
		StackCheck obj=new StackCheck();
		obj.m1(); 
		
	}
	

}
