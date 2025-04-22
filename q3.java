// Write a program to check whether a given number is positive, negative, or zero using if-else.
import java.util.Scanner;
public class q3 {
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        sc.close();
        if(num>0) {
        System.out.println(num+" is the positive number");
    }
        else if (num<0) {
        System.out.println(num+" is the negative number");
    }   
        else {
        System.out.println(num+" The number is zero");

        
    }
}
}
  
