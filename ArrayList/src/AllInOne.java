import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllInOne {
	
	public void allElements(){
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println("List before sort: "+list_Strings);
		  Collections.sort(list_Strings);
		  System.out.println("List after sort: "+list_Strings); 
		  
		  Collections.reverse(list_Strings);
		  System.out.println("reverse: "+list_Strings);

		  System.out.println();
		  searchListOfData(list_Strings,"RED");
		  
		  System.out.println();
		  copyOneListOfanOtherList(list_Strings);
		  
		  System.out.println();
		  indexWithlist(list_Strings);
		  
		  System.out.println();
		  reviserList(list_Strings);
		  
		  System.out.println();
		  System.out.println("Extract a portion" );
		  List<String> sub_List = list_Strings.subList(0, 3);
		  System.out.println("List of first three elements 0 to 3: " + sub_List);
	}
	
	public void searchListOfData(List<String> list_Strings,String val) {
		if (list_Strings.contains(val)) {
		    System.out.println("Found the element: "+val);
		    } else {
		    System.out.println("There is no such element: "+val);
		    }
	}
	
	public void copyOneListOfanOtherList(List<String> list_Strings) {
		 List<String> List2 = new ArrayList<String>();
		  System.out.println("List1: " + list_Strings);
		  for(String str:list_Strings) {
			  List2.add(str); 
		  }
		  
		  System.out.println("Copy List to List2,\nAfter copy:");
		  System.out.println("List2: " + List2);

	}
	
	public void reviserList(List<String> color) {
		System.out.println("Original array list: " + color);
		String new_color = "White";
		  color.set(1,new_color);

		  System.out.println("Replace second element with 'White'."); 
		  System.out.println(color);		  
	}
	
	public void indexWithlist(List<String> color) {
		for(int i =0 ; i<color.size();i++) {
			System.out.println("Position: "+i + " Color: "+color.get(i));
		}
	}

}
