public class roc {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 31, 40, 55};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}