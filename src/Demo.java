
public class Demo {
	public String n ="Rashi";
	public int price =1000; 
	public String colour ="Red";
	
	public void calling() {
		System.out.println("Display Rashi");
	}

	public static void main(String[] args) { 
		Demo obj= new Demo();
		obj.calling();
		System.out.println(obj.n);
		System.out.println(obj.price);
		System.out.println(obj.colour);
	
		
		

	}

}
