import java.util.Iterator;
import java.util.LinkedList;

public class AllExcMethod {

	public void allElements() {
		LinkedList<String> l_list = new LinkedList<String>();
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		          l_list.add("Yellow");
		          System.out.println("The linked list: " + l_list);
		          
		           System.out.println("Iterate All Elements");
				   iterateAllElements(l_list);
				   
				   System.out.println();
				   iterateDescindingOrder(l_list);
				   
				   System.out.println();
				   someElementsSpecifayPosition(l_list);
				   
				   System.out.println();
				   dataAndPosition(l_list);
				   
				   System.out.println();
				   compareTwoList(l_list);
				   
				   System.out.println();
		          
		          l_list.addFirst("Miraj");
		          l_list.addLast("Esa");
		          System.out.println("Insert first and last position: " + l_list);
		          
		          l_list.offerFirst("I love");
		          l_list.offerLast("You");
		          
		   System.out.println("Font of & last Of specified element: " + l_list);
		   
	}
	public void iterateAllElements(LinkedList<String>l_list) {
		 for (String element : l_list) {
			    System.out.println(element);
			    }
	}
	public void iterateDescindingOrder(LinkedList<String>l_list) {
		Iterator it = l_list.descendingIterator();
		 for(int i =0;i<l_list.size();i++) {
			 System.out.println(it.next());
		 }		 				
	}
	
	 public void someElementsSpecifayPosition(LinkedList<String>l_list) {
		 System.out.println("Original linked list:" + l_list);
		 LinkedList <String> new_l_list = new LinkedList <String> ();
		  new_l_list.add("White");
		  new_l_list.add("Pink");
		  
		  l_list.addAll(1,new_l_list);
		  
		  System.out.println("Insert some elements at the specified position:" + l_list);
	 }
	 
	 public void dataAndPosition(LinkedList<String>l_list) {
		 for(int i=0;i<l_list.size();i++) {
			 System.out.println("Data: " + l_list.get(i) + " Position: "+ i);
		 }		 
	 }
	 
	 public void compareTwoList(LinkedList<String>l_list) {
		 LinkedList<String> c2= new LinkedList<String>();
         c2.add("Red");
         c2.add("Green");
         c2.add("Black");
         c2.add("Orange");

         //comparison output in linked list
         LinkedList<String> c3 = new LinkedList<String>();
         for (String e : l_list)
            c3.add(c2.contains(e) ? "Yes" : "No");
         System.out.println(c3); 
	 }
}
