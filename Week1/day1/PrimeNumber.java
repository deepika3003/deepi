package Week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean flag = false;
		int i;
		
		for (i=2;i<=n/2;i++) {
			if(n % i == 0) {
			flag = true;
			break;
			}
	}
	
	if(!flag)
	
		System.out.println("It is a prime number");	
	else		
		System.out.println("It is not a prime number");
		
}
}
