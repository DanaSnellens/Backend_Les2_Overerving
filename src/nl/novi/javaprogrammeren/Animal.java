package nl.novi.javaprogrammeren;
public abstract class Animal {

    String name;

    String noise;

    String food;

    char sex;

    public Animal(String name, String noise, String food, char sex) {
        this.name = name;
        this.noise = noise;
        this.food = food;
        this.sex = sex;
    }


    void move() {
    System.out.println(name + "moved 0.25 meter forward.");
    }
    void makeNoise() {
        System.out.println(name + " says " + noise);
    }
    void sleep(){
        System.out.println(name + " sleeps 8 hours.");
    }

    void eat(){
        System.out.println(name + " eats " + food);
    }

    void printAllActions() {
                move();
                makeNoise();
                sleep();
                eat();
    }
    //abstract void printAllCharacteristics();
}
