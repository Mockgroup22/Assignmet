package DefaultConstuctor;

public class Employe {  
	int no;
	String name;
	
	public Employe(int no) {  
		System.out.println("Default value of no=" +no);
		
	} 
	public static void main(String[] args) { 
		Employe obj =new Employe(12); //the default constructor is used to intiallize instance variable
		
		
	}

}
