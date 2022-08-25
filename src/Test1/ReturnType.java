 package Test1;

public class ReturnType { 
	public int d1(int math,int physics,int chem,String studentname) { 
		int a =math+physics+chem; 
		System.out.println("Total marks of     :" +studentname);
		System.out.println("Marks of Math      :" +math); 
		System.out.println("Marks of Physics   :" +physics); 
		System.out.println("Marks of chemistry :" +chem);
		return a;
	  }

	public static void main(String[] args) { 
		ReturnType rt=new ReturnType();
		System.out.println(rt.d1(20,22,25,"Anand"));
	    System.out.println(rt.d1(10,10,20,"Ajay")  );
	    System.out.println(rt.d1(20,11,10,"Seema") );
	

	}

}
