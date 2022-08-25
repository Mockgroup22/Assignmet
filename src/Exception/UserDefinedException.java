package Exception;

import java.util.Scanner;

public class UserDefinedException {  
	
	public void AccDetail()  { 
		System.out.println("Enter age of that person: ");
		Scanner sc=new Scanner(System.in); 
		int age=sc.nextInt();
		
		if( age>18) 
			System.out.println("Eligible for open bank account");
		else 
			throw new ArithmeticException();
			
			
	}
	
	
	public void marks() { 
		UserDefinedException obj=new UserDefinedException(); 
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter number");
		int pin=sc.nextInt();
		if(pin==1111) 
			System.out.println("Show account detail"); 
		else
			throw new  ArithmeticException();
	}  
	
	
	public static void main(String[] args) {
		UserDefinedException obj=new UserDefinedException(); 
		obj.marks();  
		obj.AccDetail();
	}

}
