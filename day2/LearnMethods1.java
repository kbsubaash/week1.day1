package week1.day2;

public class LearnMethods1 {
	
	public static void main(String [] args) {
		LearnMethods1 obj = new LearnMethods1();
		obj.printcarName();
		obj.getCarRegNum();
		obj.getCarModel();
		long multiply3Num = obj.multiplyThreeNum(45, 956, 5679);
		System.out.println(multiply3Num);
	}
	
	public void printcarName() {
		System.out.println("Honda City");
	}
	
	public String getCarRegNum() {
		String carRegNum = "TN12J-2389";
		System.out.println(carRegNum);
		return carRegNum;
	}
	public char getCarModel() {
		char carModel = 'D';
		System.out.println(carModel);
		return carModel;
	}
	public long multiplyThreeNum(int a, int b, int c) {
		
		return a * b * c;
	}
	
}
