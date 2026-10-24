class lod {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends lod{
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}