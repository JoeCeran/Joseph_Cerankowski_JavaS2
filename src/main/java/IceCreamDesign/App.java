package IceCreamDesign;

public class App {

    public static void main(String[] args){

        //Ice Cream for the shop
        IceCreamInShop chocolate = new IceCreamInShop("chocolate", "hard", 1.50, 2);
        System.out.println(chocolate.getName() + " is a " +  chocolate.getType() + " ice cream and " +
                "is " + chocolate.getPrice() + " per scoop! \nYou want " + chocolate.scoop() + ", that comes out to:" +
                "\n$" + chocolate.scoop() + " for your order!" );

        //Ice Cream for the factory
        IceCreamFactory vanilla = new IceCreamFactory("Vanilla", "soft", 2.00, 5,1.00, 20, 50);
        System.out.println("\n" + vanilla.getName() + " is a " +  vanilla.getType() + " ice cream." + "Cream is " + vanilla.getCreamPrice() + " per pound and Ice is " +
                vanilla.getIcePrice() + " per pound. We need " + vanilla.getAmount() + " boxes of Ice cream for Joe's Ice cream, so the total amount will be: \nCream total: " +
                vanilla.creamd() + "\nIce total: " + vanilla.iced() + "\nIce cream per carton: " + vanilla.carton()+ "\nTotal Price: "  + vanilla.purchase());


    }
}
