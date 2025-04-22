//15. Input a number and display the factorial of that number using a for loop.

    import java.util.Scanner;

    public class q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

       
        System.out.println("The factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}


    

