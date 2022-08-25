package Prcaticeprogram;

public class Constructor {  
	
	public Constructor(int a,boolean c) { 
		this();
		System.out.println("I am going regular mandeer");
	} 
	public Constructor() { 
		this(10,"MONIKA");
		System.out.println("I have a class on 7am");
	} 
	public Constructor(int b,String s) {
		System.out.println("I have a Mediatation class");
	}
	 
	public static void main (String[] args) { 
		new Constructor(5,true);
		
	}

}
