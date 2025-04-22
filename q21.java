//21 Write a program to find the sum of digits of a number using a loop.
import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        scanner.close();
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}

