package lesson2;

public class stringProblemSeven {
    public static void main(String[] args) {
        String ogStr = "Button";
        String newStr = ogStr.substring(4) + ogStr.substring(0,4);
        System.out.println(newStr);
    }
}
