import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = scan.nextLine();

        System.out.print("Type your age: ");
        int userAge = scan.nextInt();

        System.out.println("Hello, " + userName + "!");
        System.out.println("I know that you are " + userAge + " years old...");

    }
}