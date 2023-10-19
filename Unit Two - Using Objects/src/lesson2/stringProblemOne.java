package lesson2;

public class stringProblemOne {
    public static void main(String[] args) {
        String one = "!!!!";
        String two = "chair";
        String outcome = one.substring(0,2) + two + one.substring(2);
        System.out.println(outcome);
    }
}
