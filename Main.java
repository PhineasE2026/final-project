import java.util.Scanner;
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);
      Dungeon md = new Dungeon();

      System.out.println("What is the player's name?");
      String fn = scan.nextLine();
      Character p1 = new Character(fn, 100, new ArrayList<Item>(), new Weapon("Irregular Brick", 20), 50);
      p1.addBackpack(new Item("Potion", "Healing"));
      System.out.println(p1);

      

   }
}
