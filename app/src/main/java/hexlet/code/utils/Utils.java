package hexlet.code.utils;

public class Utils {
    public static int getRandomNumber(int start, int finish) {
        return (int) (start + (Math.random() * finish));
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String getCorrectAnswer(String operator, int firstOperand, int secondOperand) {
        return switch (operator) {
            case " * " -> Long.toString((long) firstOperand * secondOperand);
            case " - " -> Integer.toString(firstOperand - secondOperand);
            case " + " -> Integer.toString(firstOperand + secondOperand);
            default -> null;
        };
    }

    public static boolean isEven(int question) {
        return question % 2 == 0;
    }
}
