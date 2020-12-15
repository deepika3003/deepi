package Week1.day2;

import Week1.day1.Mobile;

public class Calculator {

	public int add(int num1,int num2,int num3) {
		int sum;
		
		sum = num1 + num2+ num3;
		System.out.println("sum of numbers is " +sum);
		return sum;
	}
	
	
	public int sub(int num1,int num2) {
		int result;
		
		result = num1 -num2;
		System.out.println("subtraction of numbers is " +result);
		return result;
		
	}
	
	public double mul(double num1,double num2) {
		double result;
		
		result = num1 *num2;
		System.out.println("multiplication of numbers is " +result);
		return result;
		
	}
	
	public float div(float num1,float num2) {
		float result;
		
		result = num1 /num2;
		System.out.println("Division of numbers is " +result);
		return result;
		
	}
	
	public static void main(String[] args) {
		
       
	
}
}
