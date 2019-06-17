package CustomerComposition;

public class App {

    public static void main(String[] args){
        ShippingAddress ship = new ShippingAddress("2 ditch", "n/a", "Brick", "NJ", 07726);
        BillingAddress bill = new BillingAddress("2 ditch", "n/a", "Brick", "NJ", 07726);
        Customer customer = new Customer("Damara", "Dana", "ddana@gmail.com",
                "7325555555", ship, bill, true);

        System.out.println("My name is " + customer.getFirstName() + " " + customer.getLastName() + ". My email address is " +
                customer.getEmail() + ", my phone number is " + customer.getPhoneNumber() + ", and it is " + customer.isRewardsMember() + " that i " +
                "am a rewards member!" +
                "\nMy shipping address: " + customer.getShippingAddress() +
                "\nMy billing address: " + customer.getShippingAddress());

    }
}
