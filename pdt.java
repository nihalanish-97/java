class pdt {
    String name;
    double price;

    Product(String name) {
        this.name = name;
        this.price = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - Rs. " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Keyboard");
        Product p2 = new Product("Mouse", 799);

        p1.display();
        p2.display();
    }
}