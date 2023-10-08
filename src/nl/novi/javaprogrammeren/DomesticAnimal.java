package nl.novi.javaprogrammeren;

public abstract class DomesticAnimal extends Animal {
    String ownerName;
    String brandFood;
    String breed;

    public DomesticAnimal(String name, String noise, String food, char sex,
                          String ownerName, String brandFood, String breed) {
        super(name, noise, food, sex);
        this.ownerName = ownerName;
        this.brandFood = brandFood;
        this.breed = breed;
    }

    //Moeten hier nog de methods of kan dit direct vanuit de base class?

}
