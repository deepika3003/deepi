package Week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int nxt;
		int cur;
		Arrays.sort(arr);//1,2,3,4,6,7,8
					
		for(int i=0;i<arr.length-1;i++) 
		{
			 nxt = arr[i+1];//6
			 cur = arr[i];//4
		
		if((nxt-cur)>1)
		{							
				System.out.println(cur +1);										
		}
		}
	}
	}


