import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("enter first number");
        double num1 = scanner.nextDouble();

        System.out.println("select the operater");
        char operater = scanner.next().charAt(0);

        System.out.println("enter second number");
        double num2 = scanner.nextDouble();

        double result;

        switch (operater) {
            case '+':
                result = num1 + num2;
                System.out.println(result + "result");
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result + "result");
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result + "result");
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(result + "result");
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Division by zero is not allowed.");

        }
        scanner.close();
    }
}