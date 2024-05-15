import java.util.Scanner;

public class DisariumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }

    public static boolean isDisarium(int number) {
        int sum = 0;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, ++count);
            number /= 10;
        }

        return sum == number;
    }
}