public class vow{
    public static void main(String[] args) {

        String text = "education";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}