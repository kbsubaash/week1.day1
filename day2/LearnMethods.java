package week1.day2;

public class LearnMethods {
	
	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		// obj.MethodName();
		// print my name 
		obj.printMyName();
		
		// get phone number
		obj.getPhoneNumber();
		
		// get City name
		obj.getCityName();
		
		// add two numbers 
		int sumOfTwoNum = obj.addTwoNumbers(45, 55);
		System.out.println(sumOfTwoNum);
		
		// add two numbers 
		float sumOfNum = obj.addNumbers((float) 4.555555, 55);
		System.out.println(sumOfNum);
		
	}
//  accessModifier returnType methodName(args) {actions}

	public void printMyName() {
		System.out.println("Subaash ");
	}
	
	private long getPhoneNumber() {
		long phoneNumber = 9888894442L;
		System.out.println(phoneNumber);
		return phoneNumber;
	}
	
	public String getCityName() {
		String cityName = "Chennai";
		System.out.println(cityName);
		return cityName;
		
	}
	
	public int addTwoNumbers(int a, int b) {
		return a + b;
		
				
	}
	
	public float addNumbers(float c, int d) {
		return c + d;
		
				
	}
}
