package RPGInheritance;

public class App {

    public static void main(String[] args){

        //Create the farmer object
        Farmer farmer = new Farmer();
        farmer.setName("Bob");

        //Printout stats
        System.out.println("My name is " + farmer.getName() + ". I am a farmer. My stats are as listed: " +
                "\nStrength:" + farmer.getStrength() +
                "\nHealth: " + farmer.getHealth() +
                "\nStamina: " + farmer.getStamina() +
                "\nSpeed: " + farmer.getSpeed() +
                "\nAttack Power: " + farmer.getAttackPower());

        //Create the farmer object
        Warrior warrior = new Warrior();
        warrior.setName("Alice");

        //Printout stats
        System.out.println("\nMy name is " + warrior.getName() + ". I am a farmer. My stats are as listed: " +
                "\nStrength:" + warrior.getStrength() +
                "\nHealth: " + warrior.getHealth() +
                "\nStamina: " + warrior.getStamina() +
                "\nSpeed: " + warrior.getSpeed() +
                "\nAttack Power: " + warrior.getAttackPower());

    }

}
