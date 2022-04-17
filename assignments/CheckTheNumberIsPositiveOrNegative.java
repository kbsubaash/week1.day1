package week1.day1.assignments;

public class CheckTheNumberIsPositiveOrNegative {
    public static void main(String[] args) {

        int num = 50;

        if (num==0) {
            System.out.println("The number "+ num+ " is zero");
        }
        else if (num>0){
            System.out.println("The number "+ num+ " is positive");

        }
        else
            System.out.println("The number "+ num+ " is negative");
    }
}