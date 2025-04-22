// Write a program that takes a number and checks if it is divisible by both 5 and 11.
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num= sc.nextInt();
    sc.close();
    if(num % 5 == 0 && num % 11 ==0) {
        System.out.println(num+" is divisible by both 5 and 11");
    }
    else {
        System.out.println(num+" is not divisible by both 5 and 11");

        
    }
}
}
