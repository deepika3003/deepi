package Week1.day1;

public class Mobile {
	
	String phoneBrand = "Samsung";
	String phoneSize = "5'";
	Boolean isSmartPhone = true;
	long phNo = 123445566L;
	int modelnumber = 3426;
	int phonePrice = 15000;
	String simType = "Dual";
	
	
	
	public void sendSms() 	{
		
		System.out.println("Message sent");
	}
	
	public void makeCall() {
		
		System.out.println("Call Connected");
	}
	
	public static void main(String[] args) {

		Mobile obj = new Mobile();
		
		obj.sendSms();
		obj.makeCall();
		
		System.out.println(obj.phoneBrand);
		System.out.println(obj.phoneSize);
		System.out.println(obj.isSmartPhone);
		System.out.println(obj.phNo);
		System.out.println(obj.modelnumber);
		System.out.println(obj.phonePrice);
		System.out.println(obj.simType);
		
	}
}
