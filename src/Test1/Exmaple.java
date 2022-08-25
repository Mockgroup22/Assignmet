package Test1;

public class Exmaple { 
	int math;
	int physics;
	int chemistry;

	public  Exmaple(int math,int physics,int chemistry,String studname ) {  
		this.math=math;
		this.physics=physics;
		this.chemistry=chemistry; 
		System.out.println("Mrks of " +studname);
		
		System.out.println("Math mark displlay  =" +math);
		System.out.println("Physics mark displlay =" +physics); 
		System.out.println("Chemistry mark displlay  =" +chemistry);
		total(); 
		
		
		
		
	}   
	public void total() {
		int a = math+physics+chemistry;  
		System.out.println("Total marks of student =" +a);
		if(math>40 && physics>40 && chemistry>40 && a>120 ) { 
			System.out.println("Student are pass in all sub");
			
			
		} 
		else {
			System.out.println("Student are fail in all sub");
		}
		
			}
	
	public static void main(String[] args) { 
		  new Exmaple(10,20,30,"Ajay");
		  new Exmaple(41,52,30,"Seema");
		  new Exmaple(44,53,60,"Shivani");
		  new Exmaple(11,20,30,"Pooja");
		   
		
		
	}

}
