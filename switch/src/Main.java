import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("red");
            case "Orange" -> System.out.println("orange");
            case "Grapes" -> System.out.println("black and green");
            default -> System.out.println("enter a valid fruit");
        }

    }
}