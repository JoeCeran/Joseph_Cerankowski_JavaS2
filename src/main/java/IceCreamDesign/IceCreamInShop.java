package IceCreamDesign;

public class IceCreamInShop {

    private String name;
    private String type;
    private double price;
    private int scoops;
    public int total;

    public IceCreamInShop(String name, String type, double price, int scoops){
        this.name = name;
        this.type = type;
        this.price = price;
        this.scoops = scoops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScoop() {
        return scoops;
    }

    public void setScoop(int scoops) {
        this.scoops = scoops;
    }

    public double scoop(){
        double scooped =  price * scoops;
        return scooped;
    }
}
