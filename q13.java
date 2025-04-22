// 13. Take a number n and print the sum of first n natural numbers using a loop.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    scanner.close();
    int total = 0;
    for (int i = 1; i <= n; i++) {
        total += i;
    }
    System.out.println("The sum of the first " + n + " natural numbers is: " + total);
    }