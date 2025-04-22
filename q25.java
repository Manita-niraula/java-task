//25 Write a program to count how many digits are in a given number using a loop

    import java.util.Scanner;
    public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (num == 0) {
            System.out.println("The number has 1 digit.");
            return;
        }

        int digitCount = 0;
        for (int temp = num; temp != 0; temp = temp / 10) {
            digitCount++;
        }
        System.out.println("The number has " + digitCount + " digits.");
    }
}


    
