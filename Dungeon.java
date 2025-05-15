public class Dungeon {
    private Room[][][] rooms;
    private Room currentRoom;
    private int curLay = 0;
    private int curRow = 0;
    private int curCol = 0;

    public Dungeon() {
        rooms = new Room[5][3][2];
        currentRoom = rooms[0][0][0];

        for (int lay = 0; lay < rooms.length; lay++) {
            for (int row = 0; row < rooms[0].length; row++) {
                for (int col = 0; col < rooms[0][0].length; col++) {
                    rooms[lay][row][col] = new Room();
                }
            }
        }
    }

    public void traverseRoom() {
        if (curCol <= 2) {
            curCol++;
        }
        else {
            curCol = 0;
        }
        if (curRow <= 3) {
            curRow++;
        }
        else {
            curRow = 0;
            System.out.println("Floor cleared");
        }
        if (curLay <= 5) {
            curLay++;
        }
        else {
            curLay = 0;
            System.out.println("Tower cleared");
        }
        
        currentRoom = rooms[curLay][curRow][curCol];
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Room[][][] getRooms() {
        return rooms;
    }
}
