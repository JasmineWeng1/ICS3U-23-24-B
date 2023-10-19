package lesson2;

public class stringProblemSix {
    public static void main(String[] args) {
        String ogStr = "Hola";
        String newStr = ogStr.substring(2) + ogStr.substring(0,2);
        System.out.println(newStr);
    }
}
