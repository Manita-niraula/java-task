//22 Input a number and reverse it using a for loop.

import java.util.Scanner;

public class q22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int reversedNum = 0;
        for (;num > 0; num = num / 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }
        System.out.println("Reversed number: " + reversedNum);
        }
    }


