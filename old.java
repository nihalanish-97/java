public class old {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Two numbers = " + add(10, 20));
        System.out.println("Three numbers = " + add(10, 20, 30));
    }
}