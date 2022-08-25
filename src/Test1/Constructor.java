package Test1;

public class Constructor {   
	 int math;
	int physics; 
	 int chemistry;
	String Studentname;
	 
	      
	public Constructor(int math,int physics,int chemistry,String Studentname) {   
		 this.math =math;
		 this.physics=physics; 
		 this.chemistry=chemistry; 
		 this.Studentname=Studentname;
		 
		 
		
		System.out.println("Display Math marks =" +math );
		System.out.println("Display physics marks =" +physics);
		System.out.println("Display chemistry marks =" +chemistry);
		int a=math+physics+chemistry;  
		System.out.println("Total marks of "       +Studentname);
	    System.out.println(a);
		System.out.println("   ");
		
		
		
	}  
	
	
	public static void main(String[] args) {
		
		new Constructor(10,20,30,"Atul");
		new Constructor(11,22,33,"Akash"); 
		new Constructor(14,22,34,"Ajay");
		
	}

}
