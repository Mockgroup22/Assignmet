package Array;

public class SortArray {

	public static void main(String[] args) {   
		int empty;
		int a[] = {45,87,60,30,90,79,101}; //index size=6  size of array=7
		
		for(int i=0;i<a.length;i++) { 
			
			for(int j=i+1;j<a.length;j++) {  
				if(a[j]<a[i]) { 
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
					
				}
				
				
			} 
			
		} 
		for(int i=0;i<a.length;i++) { 
			System.out.println(a[i]+ " ");
			
		}

	}

}
