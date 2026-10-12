public class chit {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum 1 = " + add(10, 20));
        System.out.println("Sum 2 = " + add(10, 20, 30));
        System.out.println("Sum 3 = " + add(5.5, 4.5));
    }
}