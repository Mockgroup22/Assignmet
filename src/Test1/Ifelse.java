package Test1;

public class Ifelse {  
	int math; 
	int physics;
	int chemistry; int a;
	public Ifelse(int math,int physics,int chemistry,String Studentname) {  
		this.math =math;
		this.physics=physics;
		this.chemistry=chemistry;
		
		System.out.println(" Marks of  "  +Studentname);
		System.out.println("Display mark of Math  :"  +math);
		System.out.println("Display mark of Physics"  +physics);
		System.out.println("Display mark of chemistry :" +chemistry);  
	     totalmark( Studentname); 
		 System.out.println("   ");
		
	}   
	
	public void totalmark(String studName) {
		
		int a =math+physics+chemistry; 
		System.out.println("Total mark of student " +studName+ "=" +a);  
		if(math>40 && physics>40 && chemistry>40 && a>120 ) { 
			System.out.println(" STUDENT ARE PASS");
			} 
		else {
			System.out.println("STUDENT are fail");
		}
		
		
	}
	public static void main(String[] args) {  
		new Ifelse(60,45,55,"Ajay");
		new Ifelse(50,40,60,"Anand");
		new Ifelse(20,20,10,"Akash");
		
		
	}

}
