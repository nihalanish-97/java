public class chas {
    public static void main(String[] args) {

        String text = "Hello Java";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Characters = " + count);
    }
}