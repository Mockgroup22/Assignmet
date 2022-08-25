package InhPractice;

public class b1 extends D1 {  
	static int b=25;
	
	public void hh() {
		
		System.out.println("mehtod of child class");
		
	}
	public static void main(String[] args) {   
		b1 obj=new b1();
		System.out.println(b); 
		
		System.out.println("value of b=" +D1.b);
		
		
		
	}

}
