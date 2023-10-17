package lesson5;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the price of your product: ");
        int originalPrice = in.nextInt();

        double finalTotalCost = originalPrice * 0.8 * 1.13;

        System.out.println("Your final cost is: " + finalTotalCost);

        in.close();
    }
}
