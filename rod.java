import java.util.Scanner;

public class rod {

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            System.out.println("Sum = " + sum(n));
        }

        sc.close();
    }
}