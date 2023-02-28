import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
            sum();
        System.out.println(sum2());
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }
     static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

}
