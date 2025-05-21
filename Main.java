import java.util.Scanner;
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      boolean game = true;
      Scanner scan = new Scanner(System.in);
      Dungeon md = new Dungeon();

      System.out.println("What is the player's name?");
      String move = scan.nextLine();
      Character p1 = new Character(move, 100, new ArrayList<Item>(), new Weapon("Irregular Brick", 20), 50);
      p1.addBackpack(new Item("Potion", "Healing"));
      System.out.println(p1);
      
      System.out.println("\n\nYou have now entered... the dungeon.\nYou are in the very first room, at the bottom floor.\nIn each room, there are monsters. You need to destroy them all.\nFrom now on, enter item to use an item.\nEnter trade to forfeit a fight, at the cost of your purse.\nEnter any other input to attack.");
      while (game) {
         md.getEnemies();
         move = scan.nextLine();
         if (move.equals("item")){
            System.out.println("What item would you like to use?" + p1.getBackpack());
            move = scan.nextLine();
            p1.item(move);
         }
         else if (move.equals("trade")){
            p1.trade();
         }
         else {
            p1.fight();
         }
         md.traverseRoom();
         game = false;
      }
   }
}
