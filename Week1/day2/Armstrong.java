package Week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int c = 0,a,temp;
		temp = n;
		
		while(n>0) {
			a = n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp ==c)
			System.out.println(temp+ " is armstrong number");
		
		else
			System.out.println(temp+ " is not an armstrong number");
			
	}

}
