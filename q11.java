//11. Input a number from the user and display whether it is a prime number using a for loop.

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int j = 0;
        for (int i=1;i<=num;i++){
            if (num==1){
                System.out.println("Not prime");
            }
            else if (num%i==0){
                 j+=1 ;
            }
        }
        if(j==2){
            System.out.println("prime");
        }else{
            System.out.println("Not Prime");
        }    
}
}


