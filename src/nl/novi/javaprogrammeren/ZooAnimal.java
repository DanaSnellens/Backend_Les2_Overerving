package nl.novi.javaprogrammeren;

public abstract class ZooAnimal extends Animal{
    String cageName;
    String dayLastFeed;
    String countryOrigin;

    public ZooAnimal(String name, String noise, String food, char sex,
                          String cageName, String dayLastFeed, String countryOrigin) {
        super(name, noise, food, sex);
        this.cageName = cageName;
        this.dayLastFeed = dayLastFeed;
        this.countryOrigin = countryOrigin;
    }
}
