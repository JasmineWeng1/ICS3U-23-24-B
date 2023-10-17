package lesson5;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // promptimg the user for a number

        System.out.print("Please enter a number: ");
        int x = in.nextInt();
        System.out.println(x);

        System.out.print("Please enter a decimal number: ");
        double y = in.nextDouble();
        System.out.println(y);

        in.close();
    }
}