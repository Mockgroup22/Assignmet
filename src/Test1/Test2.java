package Test1;

public class Test2 { 
	public Test2() { 
		
	
		
		System.out.println("Constructor 1 is running");
	} 
	public Test2(boolean c,int a){  
		this();
		
		
		System.out.println("Constructor 2 is running");
		
	}  
	public Test2(int a,char b) {  
		this(true,12);
		
		
		System.out.println("Constructor 3 is running");
		
	}
	public static void main(String[] args) { 
		new Test2(12,'A');
		
	}
}
