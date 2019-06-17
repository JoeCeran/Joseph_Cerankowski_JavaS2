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

        farmer.harvest();

        //Create the warrior object
        Warrior warrior = new Warrior();
        warrior.setName("Alice");

        //Printout stats
        System.out.println("\nMy name is " + warrior.getName() + ". I am a warrior. My stats are as listed: " +
                "\nStrength:" + warrior.getStrength() +
                "\nHealth: " + warrior.getHealth() +
                "\nStamina: " + warrior.getStamina() +
                "\nSpeed: " + warrior.getSpeed() +
                "\nAttack Power: " + warrior.getAttackPower() +
                "\nShield Strength Power: " + warrior.getShieldStrength());

        warrior.decreaseHealth();
        System.out.println("My health is now " + warrior.getHealth());

        //Create the constable object
        Constable constable = new Constable();
        constable.setName("Jacob");

        //Printout stats
        System.out.println("\nMy name is " + constable.getName() + ". I am a constable. My stats are as listed: " +
                "\nStrength:" + constable.getStrength() +
                "\nHealth: " + constable.getHealth() +
                "\nStamina: " + constable.getStamina() +
                "\nSpeed: " + constable.getSpeed() +
                "\nAttack Power: " + constable.getAttackPower() +
                "\nShield Strength Power: " + constable.getJurisdiction());

        constable.increaseStamina();
        System.out.println("My Stamina is now " + constable.getStamina());

    }

}
