public class gih {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < 3; i++) {
            mainSum += a[i][i];
            secondarySum += a[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}