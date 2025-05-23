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

    public void fight(Character other) {
        while (other.getHealth() > 0 && this.health > 0) {
            int temp = (int) (Math.random() * 10) + 1;
            other.health -= weapon.getDamage();
            System.out.println("You struck " + other.getName() + " with your " + weapon.getName() + ", dealing " + weapon.getDamage() + " damage!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (temp > 9) {
                health -= other.getWeapon().getDamage();
                System.out.println(other.getName() + " struck you back, dealing " + other.getWeapon().getDamage() + " damage!");
                System.out.println("Your health has decreased to: " + this.health);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.health > 0) {
            System.out.println(other.getName() + " defeated! Purse collected.");
            this.purse += other.getPurse();
            System.out.println("Your purse now contains " + this.purse + " coins.");
        }
        if (other.getHealth() > 0) {
            System.out.println("You've fainted! Using healing item...");
            item("Heal");
            System.out.println("Your health has recovered to: " + this.health);
        }
    }

    public void item(String type) {
        if (type.equals("Heal")) {
            this.health += backpack.get(0).getHeal();
            System.out.println("Health restored!");
        }
        else if (type.equals("Power-up")) {
            this.health += backpack.get(0).getHeal();
            this.weapon.setDamage(weapon.getDamage() * backpack.get(0).getDamage());
            System.out.println("Power-up activated. Damage increased, health increased.");
        }
        else {
            System.out.println("Not an item!");
        }
    }
    
    public void trade() {
        this.purse = 0;
        System.out.println("You've lost all your money, but transitioned to the next room.");
    }
}
