import java.util.HashMap;
import java.util.Map;

public class HasMapProgram {
	
	public void printData() {
		  
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map = hasMapElements();
		for(Map.Entry x:hash_map.entrySet()){ 			
			   System.out.println(x.getKey()+" "+x.getValue());  
			  }
	}
	
	public void multpleKey() {
		HashMap<Integer,HashMap<Integer,String>> mapReturnPrint = multipleHas(hasMapElements());
		// To print the keys and values
		mapReturnPrint.forEach((K,V)->{    
			System.out.println(K+" "+V);// mapofmaps entries
	         V.forEach((X,Y)->{                     // inner Hashmap enteries
	             System.out.println(K+" "+X+" "+Y);       // print key and value of inner Hashmap 
	         });
	     });
	}
	
	public HashMap<Integer,String> hasMapElements(){
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		return hash_map;		
	}
	
	public HashMap multipleHas(HashMap<Integer,String> hash_map) {
		HashMap<Integer,HashMap<Integer,String>> mapReturn= new HashMap<Integer,HashMap<Integer,String>>(); 
		mapReturn.put(100, hash_map);
		mapReturn.put(101, hash_map);		
		return mapReturn;
		
	}
}
