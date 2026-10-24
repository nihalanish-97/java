class cotl {
    int length;
    int width;

    Box() {
        length = 1;
        width = 1;
    }

    Box(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 4);

        b1.area();
        b2.area();
    }
}