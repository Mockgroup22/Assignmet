package Interface1;

public class Child1 extends Child{

	@Override
	public void D2() {
		System.out.println("Mrthod of child class");
		
	} 
	public static void main(String[] args) { 
		Child1 obj=new Child1(); 
		obj.D1();
		obj.D2(); 
		Parent.D3();  
		System.out.println();
		
	}

}
