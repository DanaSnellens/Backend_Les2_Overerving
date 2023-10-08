package nl.novi.javaprogrammeren;

public class Lion extends ZooAnimal{
    int kidsAmount;


    public Lion(String name, String noise, String food, char sex,
                     String cageName, String dayLastFeed, String countryOrigin, int kidsAmount) {
        super(name, noise, food, sex, cageName, dayLastFeed, countryOrigin);
        this.kidsAmount = kidsAmount;
    }
}
