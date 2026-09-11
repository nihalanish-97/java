public class pok {
    public static void main(String[] args) {

        int[] numbers = {25, 78, 12, 95, 43};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}