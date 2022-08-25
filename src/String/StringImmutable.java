package String;

public class StringImmutable {
	String a="velocity";//String is by default immutable and final java
	public static void main(String[] args) {
		StringImmutable obj=new StringImmutable();
		obj.a="Automation";
		System.out.println(obj.a); 
		//because upon changing the string object content it will always create new object
		//It will not update or change the existing object content
		

	}

}
