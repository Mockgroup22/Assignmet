package Arraya;

import java.util.HashMap;
import java.util.Set;

public class DuplicateinString {

	public static void main(String[] args) {
		 String[]  s={"java" ,"mrunali","surbhi","java","surbhi" ,"java" }; 
		 
		 
		 HashMap<String,Integer> smap =new HashMap<String,Integer>();
		 for(String str:s) 
			 if(smap.containsKey(str))
				smap.put(str, smap.get(str) + 1);
			else
				smap.put(str, 1); 
		  
		 
		 Set<String> keys = smap.keySet();
			for (String key : keys)
				if (smap.get(key) > 1)
					System.out.println(key + ":" + smap.get(key));

		 


	}

}
