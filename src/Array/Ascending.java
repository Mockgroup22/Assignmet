package Array;

public class Ascending {

	public static void main(String[] args) { 
		int a[]= {45,36,78,69,14,87};
		int empty ;
		for(int i=0;i<a.length;i++) 
		{ 
			 for(int j=i+1;j<a.length;j++)
			 { 
				if(a[i]>a[j]) 
				{
					empty=a[i];
				    a[i] =a[j]; 
				     a[j]=empty;
				 
			    } 
			}
	 }
			 
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
			
	}
}
