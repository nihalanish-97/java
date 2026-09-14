public class iro {
    public static void main(String[] args) {

        int[] numbers = {45, 12, 78, 23, 9};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}