package lesson5;

import java.util.Scanner;

public class ExampleSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter two whole side lengths below");
        System.out.print("Side length one: ");
        int side1 = in.nextInt();

        System.out.print("Side length two: ");
        int side2 = in.nextInt();

        double length = ((double)side1 * side1) + (side2 * side2);
        double lengthOfHypotenuse = (length/length);

        System.out.print("The length of the hypotenuse is: " + lengthOfHypotenuse);

        in.close();
    }
}
