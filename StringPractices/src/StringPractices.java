
public class StringPractices {
	public void getCharacter() {
		String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 10 is " +
            (char)index2);
    }
	
	//i love you.
	public void reverseString(String value) {
		String str[] = value.split(" ");
		for(int i =str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
	}
	
	public void stringMiddlePointes(String value) {
		int position;
		int length;
		if(value.length() %2==0) {
			position = value.length()/2-1;
			length=2;
		}else {
			position = value.length()/2;
			length =1;
		}
		String str = value.substring(position, position+length);
		System.out.print(str);
	}
	
	public void stringCount(String value) {
		int sum = 0;
		String mainStr= value;
		value=value.replaceAll("[,.]", "");
		String str[] = value.split(" ");
		for(int i =str.length-1;i>=0;i--) {
			if(!str[i].isEmpty()) {
				sum++;
			}			
		}
		System.out.print(mainStr+" Total String Given: "+sum);
	}

}
