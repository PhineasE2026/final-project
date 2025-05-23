public class Item {
    private String name;
    private String use;

    public Item(String n, String u) {
        this.name = n;
        this.use = u;
    }

    public String toString() {
        return this.name + ", used for " + this.use;
    }

    public String getName() {
        return this.name;
    }

    public String getUse() {
        return this.use;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setUse(String u) {
        this.use = u;
    }

    public double getHeal() {
        if (this.name.equals("Potion")) {
            return 100;
        }
        else {
            return 50;
        }
    }

    public double getDamage() {
        if (this.name.equals("Butterscotch Pie")) {
            return 2;
        }
        else {
            return 3;
        }
    }
}
