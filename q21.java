//21 Write a program to find the sum of digits of a number using a loop.
import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = Math.abs(number); 
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }
}
