package Casting;

public class Doubleequal {

	public static void main(String[] args) {
		String a="mrunali";  
	 String b="mrunali"; 
		String c = new String("mrunali");  //is the reference variabl pointing to the same objector not 
		System.out.println(c.equals(a));//it check content is same or not  
		if(a==b) 
			System.out.println("true"); 
		if(a==c) 
			System.out.println("false"); 
		if(a.equals(c))
			System.out.println(true);
		if(a.equals(b))
			System.out.println(false); 
		

	}

}
