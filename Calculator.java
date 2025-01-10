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

            
        }

    }
}
