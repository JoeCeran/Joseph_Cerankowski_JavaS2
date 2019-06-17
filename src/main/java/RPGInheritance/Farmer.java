package RPGInheritance;

public class Farmer extends Character{

        private String name;
        private int strength = 75;
        private int health = 100;
        private int stamina = 75;
        private int speed = 10;
        private int attackPower = 1;

        public Farmer(String name, int strength, int health, int stamina, int speed,
                         int attackPower){
            this.name = name;
            this.strength = strength;
            this.health = health;
            this.stamina = stamina;
            this.speed = speed;
            this.attackPower = attackPower;
        }

        public Farmer(){

        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getStamina() {
            return stamina;
        }

        public void setStamina(int stamina) {
            this.stamina = stamina;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getAttackPower() {
            return attackPower;
        }

        public void setAttackPower(int attackPower) {
            this.attackPower = attackPower;
        }

        void run(){
            System.out.println("I run!");
        }

        void plow(){
            System.out.println("I plow!");
        }

        void harvest(){
            System.out.println("I harvest!");
        }

        void attack(){
            System.out.println("I attack!");
        }

        void hea1() {
            health += 5;
        }

        void decreaseHealth(){
            System.out.println("Ouch!");
            health -= 5;
        }

        void increaseStamina(){
            stamina += 5;
        }

        void decreaseStamina(){
            stamina -= 5;
        }


}
