//1 Write a Java program to input your full name and print a greeting message.
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    sc.close();
    }
}
