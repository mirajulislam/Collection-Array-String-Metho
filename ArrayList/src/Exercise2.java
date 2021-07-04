import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	
	public void arrayListEx(){
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println(list_Strings);
		  for(String str:list_Strings) {
			  System.out.println(str);
		  }		
	}	

}
