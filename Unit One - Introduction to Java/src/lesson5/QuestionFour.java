package lesson5;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter any whole value for distance in km: ");
        int distance = in.nextInt();

        System.out.println(" ");

        System.out.print("Please enter any whole value for time in hours: ");
        int time = in.nextInt();

        double speed = ((double)distance)/time;
        System.out.println(" ");
        System.out.print("Speed equals: " + speed);

        in.close();
    }

}
