package Encapsulation;

import java.util.Scanner;

public class Main { 
	private int Salary =1000; 
	public int getmethod() { 
		Scanner security= new Scanner(System.in);
		System.out.println("Enter password of employee"); 
		int pin=security.nextInt();
		if( pin==1010) { 
			return Salary;
			
			
		} else 
			return(Integer)null;
			
	} 
	public void setSal(int Salary) { 
		Scanner security=new Scanner(System.in); 
		System.out.println("Enter Hr Pasword:"); 
		int pin =security.nextInt();
		if(pin==1212)
			this.Salary=Salary;
		
		
	}
	

}
