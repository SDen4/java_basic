import java.util.Objects;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // =========== if-else =========== //
        short a = 14, b = 15;

        if (a > b) {
            System.out.println("greather");
        } else if (a < b) {
            System.out.println("less");
        } else {
            System.out.println("equal");
        }

        boolean isVisible = true;
        if (!isVisible) {
            System.out.println("not visible");
        } else {
            System.out.println("visible");
        };

        String role = "admin";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your role ");
        String userRole = scanner.nextLine();
        // Compare strings (!!!)
        if (Objects.equals(userRole, role)) {
            System.out.println("Hello, admin! How are you?)");
        } else {
            System.out.println("Who are you mf?..");
        };

        // =========== switch-case =========== //
        byte num = 3;

        System.out.println("Let start the game!");
        System.out.println("Gess the number from 1 to 10");
        byte usersNum = scanner.nextByte();

        switch (usersNum) {
            case 10: System.out.println("Less"); break;
            case 0: System.out.println(("Greather")); break;
            case 3: System.out.println("You win!"); break;
            default: System.out.println("You're loser!");
        }
    }
}
