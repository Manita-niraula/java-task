// 10. Write a program to take a number from the user and print whether it is a leap year or not.

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
System.out.print("Enter the year: ");
int year= sc.nextInt();
sc.close();
if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        System.out.println(year+" is leap year.");
    }     
else {
        System.out.println(year+" is not a leap year");

        
    }
    }
}
    
