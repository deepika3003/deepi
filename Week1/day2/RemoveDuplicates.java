package Week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 int[] arr = {4,6,4,2,9,2,8,10};
		 int[] temp = new int[arr.length];
		 int j=0;
		 Arrays.sort(arr);//2,2,4,4,6,8,9,10
		 
		 for(int i=0;i<arr.length-1;i++)
		 {			
			 if(arr[i]!=arr[i+1])//2ne4,4ne6
			 {				 
				 temp[j] = arr[i];//temp = 2,4,6,8,9,10
				 
				 }
			 
			 System.out.println(temp[j]);
		 }
				 					 	
	}
}
	
