package lesson5;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a price in USD: ");
        int usDollars = in.nextInt();

        double canadianDollars = (usDollars * 1.25);

        System.out.println("Price in CAD: " + canadianDollars);

        in.close();

    }
}
