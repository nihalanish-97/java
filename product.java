class product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 999);
        Product p2 = new Product("Mouse", 799);

        p1.display();
        p2.display();
    }
}