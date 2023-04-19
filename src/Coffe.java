public class Coffe {
    private String name;
    private int cost;
    private double temperature;
    private int volume;

    public String getName() {
        return name;
    }

    public int getCost(){
        return cost;
    }
    public Coffe(String name, int cost, double temperature, int volume) {
        this.name = name;
        this.cost = cost;
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Cost: %d rub, Temperature: %.1ft, volume: %d",
                name, cost, temperature, volume);
    }
}
