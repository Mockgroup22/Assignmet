package loop;

public class Continue {

	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {  
			if(x==3) 
			continue;  //3 skip ho jayega remanining execute hoga 
			System.out.println(x); 
			
			}
       
		System.out.println("out of loop ");
	}

}
