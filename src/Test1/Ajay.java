package Test1;

public class Ajay { 
	 int Math=22;
	 int Physics=33;
	 int Chemistry =44;  
	public  void d3() {
		int add =Math+Physics+Chemistry;
		System.out.println("Display Ajay marks  =" +add);
	}

	public static void main(String[] args) { 
//		 Ajay ob =new  Ajay();
//		 Avdut ob1=new Avdut(); 
//		Seema.d2();
//		ob1.d1();
//		ob.d3(); 
		Seema.Math=20;
		Seema.Physics=12;
		Seema.Chemistry=10;
		int add =Seema.d2();
		System.out.println("Seema Addition : "+add);
	
		System.out.println("Avdut Addition : " +(Avdut.Math+Avdut.Physics+Avdut.Chemistry));

	}

}
