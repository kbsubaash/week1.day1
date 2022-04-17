package week1.day1.assignments;

public class ConvertTheNumberFromNegativeToPositive {
public static void main(String[] args) {
	int num = 74;
	
	if (num < 0) {
		int pnum = num * (-1);
		System.out.println("The number " +num + " is converted to " +pnum);
		}
	else {

        System.out.println(" Given Number " +num +  " is positive");
        }
	}
}

