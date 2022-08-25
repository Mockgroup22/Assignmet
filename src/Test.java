import Test1.Avdut;

public class Test {   
	/*int Math;
	int Physics; 
	int Chemistry;*/ 
	int add;
	
	
	public  void ajay() {   
		int Math=20,Physics=10,Chemistry=15;
       
		
		System.out.println("Display  number of Ajay  =" +(add=Math+Physics+Chemistry));
		
	} 
	public void avdut() {  
		int Math=21,Physics=20,Chemistry=25;
		System.out.println("Display  number of Avdut  =" +(add=Math+Physics+Chemistry));
		
	}  
	public void seema() { 
		int Math=22,Physics=15,Chemistry=15; 
		System.out.println("Display  number of Seema  =" + (add=Math+Physics+Chemistry));
		
		
	}
	public static void main(String[] args) { 
		Test ob=new Test();
		ob.ajay(); 
		ob.avdut();
		ob.seema();
		
	}

}
