package RPGInheritance;

public class Warrior extends Character {

    private String name;
    private int strength = 75;
    private int health = 100;
    private int stamina = 100;
    private int speed = 50;
    private int attackPower = 10;
    private int shieldStrength = 100;

    public Warrior(String name, int strength, int health, int stamina, int speed,
                     int attackPower, int shieldStrength){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
    }

    public Warrior(){

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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        shieldStrength = shieldStrength;
    }

    void run(){
        System.out.println("I run!");
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

    void decreaseShieldStrength(){
        shieldStrength -= 5;
    }

}
