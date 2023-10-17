package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        // declare a variable to assign to the Scanner object
        Scanner input; // need to import the scanner to use it

        input = new Scanner(System.in); // System.in refers to the keyboard
                                        // input variable is a Scanner that gets input from the keyboard
        
        input.close();
    }
}
