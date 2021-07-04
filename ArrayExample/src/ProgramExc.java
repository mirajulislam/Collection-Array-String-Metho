import java.util.Arrays;
import java.util.Scanner;

public class ProgramExc {
	
	public void arrayMaxMin(int size) {
		int[]num = new int[size];
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number");
		for(int i = 0; i<size;i++) {
			num[i]=console.nextInt();
		}
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<size;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		for(int i=0;i<size;i++) {
			if(num[i]<min) {
				min = num[i];
			}
		}
		 System.out.println("Largest element: " + max 
                 + " Smallest element: " + min);
	}
	
	public void sumOfArray(int size) {
		int[]num = new int[size];
		int sum =0;
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<size;i++) {
		   num[i]= scr.nextInt();
		}
		
		for(int i= 0; i<size;i++) {
			sum += num[i];
		}
		 System.out.println("Sum Of Array: " + sum );
	}
	
	public void searchNumber(int size,int value) {
		int[]num = new int[size];
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<size;i++) {
		   num[i]= scr.nextInt();
		}
		for(int n:num) {
			if(value==n) {
				System.out.println("It's here:"+n);
			}else {
				System.out.println("It's Not here:"+n);
			}
		}
	}
	
	public void reverseOfArray(int size) {
		int[]num = new int[size];
		int[]num1 = new int[size];
		int j =0;
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<size;i++) {
		   num[i]= scr.nextInt();
		}				
		 System.out.println("Array: " + Arrays.toString(num) );
		 for(int i = size-1; i >=0 ; i--){
		   num1[j] = num[i];
		   j++;
		  }
		 System.out.println("After reverse the second element: "+Arrays.toString(num1));
	}
	
	public void pairValue(int size, int value) {
		int[]num = new int[size];
		System.out.println("Enter number");
		Scanner scr =new Scanner(System.in);
		for(int i=0;i<size;i++) {
		   num[i]= scr.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==value) {
					System.out.println(num[i]+" + "+num[j]+" =  "+value);
				}
			}
		}
	}
}
