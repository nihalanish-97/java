import java.util.Scanner;

public class pin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        System.out.println("Number of words = " + words.length);

        sc.close();
    }
}