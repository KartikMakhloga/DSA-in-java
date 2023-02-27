import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("kartik makhloga");
            case 2 -> System.out.println("rahul");
            case 3 -> {
                System.out.println("emp no. 3 ");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("management department");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("enter valid entries");
        }
        }
}
