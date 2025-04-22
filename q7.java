// 8. Input the age of a person and check if they are eligible to vote (18 or older).
import java.util.Scanner;

public class q7 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the age: ");
    int age= sc.nextInt();
    sc.close();
    
if(age>18){
    System.out.println("You can vote");

} else {
    System.out.print("You cannot vote");
}


    
}
}
