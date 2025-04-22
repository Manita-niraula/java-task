// 8. Write a program to input a character and check if it is a vowel or a consonant using if-else.
import java.util.Scanner;

public class q8 {
 public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
System.out.print("Enter the letter: ");
char letter= sc.next().charAt(0);
sc.close();
if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        System.out.println(letter+" is vowel.");
    }     
else {
        System.out.println(letter+" is consonant");        
    }
    }
}

