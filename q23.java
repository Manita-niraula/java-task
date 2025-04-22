// 23. Take a number and check whether it is a palindrome or not using if-else and loop.
import java.util.Scanner;

public class q23 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int originalNum = num;
        int reversedNum = 0;
        for (;num > 0; num = num / 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}

    

