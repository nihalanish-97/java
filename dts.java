import java.util.Scanner;

public class dts {

    static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(n));

        sc.close();
    }
}