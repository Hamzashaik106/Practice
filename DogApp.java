class Dog {
    String name;
    int age;
    String breed;
    int weight;

    void eat() {
        System.out.println("dog is eating");
    }

    void bark() {
        System.out.println("dog is barking");
    }

    void sleep() {
        System.out.println("dog is sleeping");
    }
}

class DogApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.eat();
        d1.sleep();
        d1.bark();

        d2.eat();
        d2.sleep();
        d2.bark();

        d3.eat();
        d3.sleep();
        d3.bark();
        new Dog().bark();
    }
}
