package lesson5;

import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a temperature in Fahrenheit: ");
        int Fahrenheit = in.nextInt();
        
        double celsius = ((double)Fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);

        in.close();

    }
}
