//18 Input a month number (1–12) and print the number of days in that month using switch.
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 12): ");
        int day = scanner.nextInt();

        // Display day using switch
        switch (day) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");  
                break;
            case 9:
                System.out.println("September"); 
                break;
            case 10:
                System.out.println("October"); 
                break;
            case 11:
                System.out.println("November"); 
                break;
            case 12:
                System.out.println("December");     
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}
