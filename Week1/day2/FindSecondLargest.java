package Week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7};
		
		Arrays.sort(num);//2,3,4,6,7,11//
		
		
		System.out.println( "the second largest number is:" +num[num.length-2]);
		
	}

}
