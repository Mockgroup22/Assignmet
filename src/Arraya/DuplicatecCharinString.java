package Arraya;

import java.util.HashMap;
import java.util.Set;

public class DuplicatecCharinString {

	public static void main(String[] args) {
		String a= "morningstar"; 
		    char ch[]= a.toCharArray(); 
		    
		    HashMap<Character,Integer> hp=new  HashMap<Character,Integer>(); 
		    for(char str1 :ch) 
		    	if(hp.containsKey(str1)) 
		    		hp.put(str1,hp.get(str1)+1);
		    		
		    	
		    	else 
		    		hp.put(str1, 1); 
		    	
		    	
		    	Set<Character> keys = hp.keySet();
				for(char key:keys)
					if(hp.get(key)>1)
						System.out.print(key +":" + hp.get(key)+" ");

		    }
  
	}


