//19 Take a character input and use switch to display if it is a vowel (a, e, i, o, u)
import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("The character '" + ch + "' is a vowel.");
                break;
            default:
                System.out.println("The character '" + ch + "' is not a vowel.");
        }
    }
}  
