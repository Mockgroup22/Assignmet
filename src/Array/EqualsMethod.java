package Array;

import java.util.Arrays;

public class EqualsMethod {  
	public static void main(String[] args) {
		
	
	int a[] = {1,2,3,4,5};
	int b[]= {14,7,9,47}; 
	int c[]= {1,2,3,4,5};  
	System.out.println(Arrays.equals(c, a)); 
	System.out.println(Arrays.equals(b, c));
	System.out.println(Arrays.equals(c, b));
	
	

}
}
