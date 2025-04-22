// 6. Write a JAVA program to check whether a number is even or odd.
import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number");
int num= sc.nextInt();
sc.close();
if(num % 2 == 0 ) {
        System.out.println(num+" is even number");
    }
else {
        System.out.println(num+" is odd number");

        
    }
}
}