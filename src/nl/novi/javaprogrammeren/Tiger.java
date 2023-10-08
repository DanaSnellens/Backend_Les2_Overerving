package nl.novi.javaprogrammeren;

public class Tiger extends ZooAnimal{
    int stripesAmount;

    String noise = "Growlll";           //KLOPT DIT HIER??
    public Tiger(String name, String noise, String food, char sex,
                String cageName, String dayLastFeed, String countryOrigin, int stripesAmount) {
        super(name, noise, food, sex, cageName, dayLastFeed, countryOrigin);
        this.stripesAmount = stripesAmount;
    }


}
