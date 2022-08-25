package String;



public class equals { 
	
public static void main(String[] args) {
	String s="mrunali";
	String s1="Mrunali";  
	String s2="abc";
	boolean val=s1.equals(s); //is used to matching the content
	System.out.println(val);  
	boolean v=s1.equalsIgnoreCase(s); //ignore the case and matching the content
	System.out.println(v); 
	boolean d=s1.equalsIgnoreCase(s2);
	System.out.println(d);
	
}
	

}
