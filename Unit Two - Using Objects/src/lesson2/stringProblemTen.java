package lesson2;

public class stringProblemTen {
    public static void main(String[] args) {
        String name = "Robin";
        int n = 2;
        String newStr = name.substring(0,n) + name.substring(3);
        System.out.println(newStr);
    }
}
