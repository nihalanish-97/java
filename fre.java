import java.util.Scanner;

public class fre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character: ");
        char search = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == search) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);

        sc.close();
    }
}