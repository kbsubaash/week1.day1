package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calcu=new Calculator();
		long addition = calcu.add(1200, 3600, 7200);
		System.out.println("ADDITION: "+addition);
		
		int subtraction = calcu.subtract(55555,33333);
		System.out.println("SUBTRACTION: "+subtraction);
		
		double multiplication = calcu.mul(34.345F, 56.987F);
		System.out.println("Multiplication: " +multiplication);
		
		float divide = calcu.divide(34.567F, 56.78F);
		System.out.println("Division: "+divide);
	}

}
