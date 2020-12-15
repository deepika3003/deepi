package Week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum;
		int range = 8;
		int i;
				
System.out.println(firstNum);
		
		for(i=1;i<8;i++) {
			sum= firstNum+secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
					
					
		}
	}

}
