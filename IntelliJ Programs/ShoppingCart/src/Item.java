public class Item {
    String name;
    int cost;

    public Item() { }

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ( "Name: " + name + ", Cost: " + String.valueOf(cost));
    }
}