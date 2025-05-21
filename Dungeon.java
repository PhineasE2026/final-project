import java.util.ArrayList;

public class Dungeon {
    private Room[][][] rooms;
    private Room currentRoom = new Room();
    private int curLay = 0;
    private int curRow = 0;
    private int curCol = 0;

    public Dungeon() {
        rooms = new Room[5][3][2];
        for (int lay = 0; lay < rooms.length; lay++) {
            for (int row = 0; row < rooms[0].length; row++) {
                for (int col = 0; col < rooms[0][0].length; col++) {
                    rooms[lay][row][col] = new Room();
                }
            }
        }
        currentRoom = rooms[0][0][0];
    }

    public void traverseRoom() {
        if (curCol < rooms[0][0].length - 1) {
            curCol++;
        } else {
            curCol = 0;
        if (curRow < rooms[0].length - 1) {
            curRow++;
        } else {
            curRow = 0;
            System.out.println("Floor cleared");
            if (curLay < rooms.length - 1) {
                curLay++;
            } else {
                curLay = 0;
                System.out.println("Tower cleared");
            }
        }
    }
    currentRoom = rooms[curLay][curRow][curCol];

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Room[][][] getRooms() {
        return rooms;
    }

    public void getEnemies() {
        currentRoom.getEnemies();
    }
}
