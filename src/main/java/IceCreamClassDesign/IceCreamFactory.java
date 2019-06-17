package IceCreamClassDesign;

public class IceCreamFactory {

    private String name;
    private String type;
    private double creamPrice;
    private int creamAmount;
    private double icePrice;
    private int iceAmount;
    private int amount;
    private double price;
    private double cream;
    private double ice;
    public double total;

    public IceCreamFactory(String name, String type, double creamPrice, int creamAmount, double icePrice,
                           int iceAmount, int amount){
        this.name = name;
        this.type = type;
        this.creamPrice = creamPrice;
        this.creamAmount = creamAmount;
        this.icePrice = icePrice;
        this.iceAmount = iceAmount;
        this.amount = amount;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public double getCreamPrice() { return creamPrice; }

    public void setCreamPrice(double creamPrice) { this.creamPrice = creamPrice; }

    public int getCreamAmount() { return creamAmount; }

    public void setCreamAmount(int creamAmount) { this.creamAmount = creamAmount; }

    public double getIcePrice() { return icePrice; }

    public void setIcePrice(double icePrice) { this.icePrice = icePrice; }

    public int getIceAmount() { return iceAmount; }

    public void setIceAmount(int iceAmount) { this.iceAmount = iceAmount; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public double getCream() { return cream; }

    public void setCream(double cream) { this.cream = cream; }

    public double getIce() { return ice; }

    public void setIce(double ice) { this.ice = ice; }

    public double getTotal() { return total; }

    public void setTotal(double total) { this.total = total; }

    public double creamd(){
        cream = creamAmount * creamPrice;
        return cream;
    }

    public double iced(){
        ice = iceAmount * icePrice;
        return ice;
    }

    public double carton(){
        price = (cream + ice) / 10;
        return price;
    }

    public double purchase(){
        total =  price * amount ;
        return total;
    }
}
