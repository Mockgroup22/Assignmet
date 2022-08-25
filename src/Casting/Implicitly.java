package Casting;

public class Implicitly {

	public static void main(String[] args) {
		byte a=13;
		short b=a;
		int c=b;
		double d=c;
		System.out.println(d); 
		
		byte e=12;
		int f=(int)e; 
		System.out.println(f);
		

	}

}
