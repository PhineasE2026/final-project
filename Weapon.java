public class Weapon extends Item {
    private double damage;

    public Weapon(String n, double d) {
        super(n, "Combat");
        this.damage = d;
    }

    public String toString() {
        return super.getName() + ", " + this.damage + " damage";
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double d) {
        this.damage = d;
    }
}
