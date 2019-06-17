package RPGInheritance;

public class Constable extends Character{

    private String name = "Alice";
    private int strength = 60;
    private int health = 100;
    private int stamina = 60;
    private int speed = 20;
    private int attackPower = 5;
    private String jurisdiction = "Morrowind";

    public Constable(String name, int strength, int health, int stamina, int speed,
                     int attackPower, String jurisdiction){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    public Constable(){

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

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    void run(){
        System.out.println("I run!");
    }

    void arrest(){
        System.out.println("You're under arrest!");
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
