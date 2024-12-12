import java.util.Scanner;

public class Main {

    static double addition(double x, double y) {
        return x + y;
    }

    static double subtraction(double x, double y) {
        return x - y;
    }

    static double multiplication(double x, double y) {
        return x * y;
    }

    static double division(double x, double y) {
        return x / y;
    }

    static double power(double x, double y) {
        return Math.pow(x, y);
    }

    static double squareRoot(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    static double factorial(double x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

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

            menu(); 
            char operation = scanner.next().charAt(0); 

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
        } while (y == 0);

        scanner.close();
    }
}
