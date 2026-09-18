public class doh {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Main diagonal:");

        for (int i = 0; i < 3; i++) {
            System.out.print(a[i][i] + " ");
        }
    }
}