package String;

public class Split {

	public static void main(String[] args) {
		String  s="Mrunali Wadhekar";
		System.out.println(s);
	   String[] val	=s.split("\\s");
	   for(int i=0;i<val.length;i++) {
		   System.out.println(val[i]);
	   }
		
		
		

	}

}
