import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bufferCalculator = true;

        System.out.println("Welcome to the Calculator App!");

        while (bufferCalculator) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition(+)");
            System.out.println("2. Subtraction(-)");
            System.out.println("3. Multiplication(*)");
            System.out.println("4. Division(/)");
            System.out.println("5. Exit program.");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the program. Good bye!");
                bufferCalculator = false;
                break;
            }

            System.out.println("Enter first number: ");
            double firstnum = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double secondnum = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (firstnum + secondnum));
                    break;

                case 2:
                System.out.println("Result: " + (firstnum - secondnum));
                break;

                case 3:
                System.out.println("Result: " + (firstnum * secondnum));
                break;

                case 4:
                if (secondnum != 0) {
                System.out.println("Result: " + (firstnum / secondnum));
                } else {
                    System.out.println("Error. Division by 0 is not allowed.");
                }
                break;
                default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
