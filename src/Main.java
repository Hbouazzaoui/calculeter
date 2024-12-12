import java.util.Scanner;

public class Main {

    // Function dyl addition\
    static double addition(double x, double y) {
        return x + y;
    }

    // Function dyl subtraction
    static double subtraction(double x, double y) {
        return x - y;
    }

    // Function dyl multiplication
    static double multiplication(double x, double y) {
        return x * y;
    }

    // Function for division
    static double division(double x, double y) {
        return x / y;
    }

    // Function for power (Exponentiation)
    static double power(double x, double y) {
        return Math.pow(x, y);
    }

    // Function for square root (in this case calculates hypotenuse sqrt(x^2 + y^2))
    static double squareRoot(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    // Function for factorial
    static double factorial(double x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    // Function to display the menu
    static void menu() {
        System.out.println("+: Addition");
        System.out.println("-: Subtraction");
        System.out.println("*: Multiplication");
        System.out.println("/: Division");
        System.out.println("^: Power");
        System.out.println("|: Square Root");
        System.out.println("!: Factorial");
        System.out.println("Please enter operation: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x, y;
        double result;

        do {
            System.out.println("Enter the value of x: ");
            x = scanner.nextDouble();
            System.out.println("Enter the value of y: ");
            y = scanner.nextDouble();

            menu(); // Display the menu
            char operation = scanner.next().charAt(0); // Get the operation choice

            // Execute the operation based on user input
            switch (operation) {
                case '+':
                    result = addition(x, y);
                    System.out.println("The sum is: " + result);
                    break;
                case '-':
                    result = subtraction(x, y);
                    System.out.println("The difference is: " + result);
                    break;
                case '*':
                    result = multiplication(x, y);
                    System.out.println("The multiplication is: " + result);
                    break;
                case '/':
                    if (y == 0) {
                        System.out.println("Division by zero is not possible.");
                    } else {
                        result = division(x, y);
                        System.out.println("The division result is: " + result);
                    }
                    break;
                case '^':
                    result = power(x, y);
                    System.out.println("The result of power is: " + result);
                    break;
                case '|':
                    result = squareRoot(x, y);
                    System.out.println("The square root result is: " + result);
                    break;
                case '!':
                    result = factorial(x);
                    System.out.println("The factorial is: " + result);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        } while (y == 0); // Loop until valid input (non-zero for division)

        scanner.close(); // Close the scanner after use
    }
}
