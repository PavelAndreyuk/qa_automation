import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите действие, которое хотите выполнить: ");
        Scanner in = new Scanner(System.in);
        String action = in.nextLine();
        System.out.println("Введите два числа, над которыми вы хотите произвести действие: ");
        double firstNumber = Double.parseDouble(in.nextLine());
        double secondNumber = Double.parseDouble(in.nextLine());
        switch (action) {
            case "+":
                System.out.println("Результат: " + sum(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println("Результат: " + sub(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println("Результат: " + mult(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println("Результат: " + div(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Вы ввели неправильное действие");
        }
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divide by 0");
        return a / b;
    }
}
