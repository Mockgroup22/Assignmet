package Exception;

public class Demo { 
	public static void main(String[] args) throws InterruptedException {
		System.out.println(4/2); 
		System.out.println(6/3); 
		System.out.println(8/4);
		System.out.println(12/6); 
		try {
			System.out.println(100/0);
		} 
		catch(ArithmeticException ref){
			System.out.println("Exception occur zero number share" ); 
			System.out.println("Exception:" +ref.getMessage());
		}
		System.out.println(14/7); 
		System.out.println(16/8);
	}

}
