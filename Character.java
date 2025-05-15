import java.util.ArrayList;

public class Character {
    private String name;
    private double health;
    private ArrayList<Item> backpack = new ArrayList<Item>();
    private Weapon weapon;
    private int purse;

    public Character() {
        this.name = "John Doe";
        this.health = 100.0;
    }

    public Character(String n, double h, Weapon w, int p) {
        this.name = n;
        this.health = h;
        this.weapon = w;
        this.purse = p;
        this.backpack = null;
    }

    public Character(String n, double h, ArrayList<Item> b, Weapon w, int p) {
        this.name = n;
        this.health = h;
        this.backpack = b;
        this.weapon = w;
        this.purse = p;
    }

    public String toString() {
        return ("Name: " + this.name + ", health: " + this.health + ", backpack: " + this.backpack + ", weapon: " + this.weapon + ", purse: " + this.purse);
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public ArrayList<Item> getBackpack() {
        return this.backpack;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public int getPurse() {
        return this.purse;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setHealth(double d) {
        this.health = d;
    }

    public void setBackpack(ArrayList<Item> a) {
        this.backpack = a;
    }

    public void addBackpack(Item i) {
        this.backpack.add(i);
    }

    public void setWeapon(Weapon w) {
        this.weapon = w;
    }

    public void setPurse(int i) {
        this.purse = i;
    }

    public void addCash(int c) {
        this.purse += c;
    }
}
