package lesson5;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a radius: ");
        int radius = in.nextInt();

        double area = 3.145 * radius * radius;
        double circumference = 2 * 3.145 * radius;

        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circumference);

        in.close();
    }
}
