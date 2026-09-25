public class mat {
    public static void main(String[] args) {

        int[][] a = {
            {10, 25, 8},
            {45, 12, 30},
            {6, 50, 20}
        };

        int largest = a[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }
        }

        System.out.println("Largest = " + largest);
    }
}