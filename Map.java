public class Map {
    private final char WATER='~';
    private final char CARR = '#';
    private final char SHOT = '*';
    private final char CRASHSHIP ='@';

    public char[][] view = new char[10][];
    private char[][] map = new char[10][];

    public void setShip() {
        
    }

    private void autoSetShip() {

    }

    public void setup() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j]=WATER;
                view[i][j]=WATER;
            }
        }
    }
}