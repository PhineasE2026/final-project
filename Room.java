import java.util.ArrayList;

public class Room {
    private int size;
    private ArrayList<Character> enemies = new ArrayList<Character>();
    private Character[] enemiesList = {
        new Character("Witch", 75, new Weapon("Potion", 5), 20),
        new Character("Spider", 35, new Weapon("Fangs", 5), 10),
        new Character("Zombie", 90, new Weapon("Bite", 5), 15),
        new Character("Goblin", 60, new Weapon("Knife", 10), 225),
        new Character("Troll", 135, new Weapon("Club", 20), 50),
        new Character("Skeleton", 50, new Weapon("Bow", 5), 0),
        new Character("Vampire", 100, new Weapon("Bite", 10), 65),
        new Character("Werewolf", 135, new Weapon("Claws", 15), 40),
        new Character("Ghoul", 35, new Weapon("Bow", 2.5), 5),
        new Character("Slime", 75, new Weapon("Charge", 5), 15),
        new Character("Golem", 180, new Weapon("Slam", 25), 90),
        new Character("Basilisk", 350, new Weapon("Bite", 50), 525),
        new Character("Hydra", 450, new Weapon("Acid Spit", 60), 600),
        new Character("Harpy", 45, new Weapon("Claws", 5), 50),
        new Character("Demon", 125, new Weapon("Fireball", 25), 100),
        new Character("Fire Elemental", 140, new Weapon("Fireball", 10), 10),
        new Character("Water Elemental", 140, new Weapon("Water Cannon", 10), 10),
        new Character("Earth Elemental", 140, new Weapon("Rock Throw", 10), 10),
        new Character("Air Elemental", 140, new Weapon("Gust", 0), 10),
        new Character("Necromancer", 110, new Weapon("Mini-Skeleton", 10), 85),
        new Character("Bandit", 100, new Weapon("Revolver", 15), 100),
        new Character("Cultist", 100, new Weapon("Staff", 10), 80),
        new Character("Mind Flayer", 165, new Weapon("Hypnotize", 20), 125),
        new Character("Wendigo", 200, new Weapon("Slam", 30), 100),
        new Character("Banshee", 90, new Weapon("Scream", 5), 45),
        new Character("Siren", 1, new Weapon("Sing", 0), -100),
        new Character("Centaur", 250, new Weapon("Axe", 40), 475),
        new Character("Dryad", 85, new Weapon("Green Orb", 5), 30),
        new Character("Djinn", 10, new Weapon("Mystic Wind", 0.5), 100),
        new Character("Yeti", 300, new Weapon("Crush", 45), 300),
        new Character("Kraken", 750, new Weapon("Tentacle Slam", 80), 1500),
        new Character("Shade", 1, new Weapon("Wave", 0), 0),
        new Character("The Bay Harbor Butcher", 9999, new Weapon("The Table", 100), 1031444160)
    };
    private int numGold;

    public Room() {
        this.size = (int) (Math.random() + 1) * 12;
        this.numGold = 10;
        for (int i = 0; i < this.size; i++) {
            int temp = (int) Math.random() * enemiesList.length;
            this.enemies.add(enemiesList[temp]);
            this.numGold *= this.size;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void getEnemies() {
        for (int i = 0; i < enemies.length; i++) {
            System.out.println(enemies.get(i).getName());
        }
    }

    public Character[] getEnemiesList() {
        return enemiesList;
    }

    public int getNumGold() {
        return numGold;
    }
}
