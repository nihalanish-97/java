class roj{
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "BMW";
        c.speed = 180;

        c.display();
    }
}