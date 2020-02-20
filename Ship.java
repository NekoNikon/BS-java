import java.util.LinkedList;

class TypeShip { 
    public int BOAT = 1;
    public int DESTROYER = 2;
    public int CRUISER = 3;
    public int BATTLSESHIP = 4;
}

class Coord {
    public int x;
    public int y;
    public boolean is_crash;
}


class Ship {
    public LinkedList<Coord> coords;
    public TypeShip type;
    
    public void addCarr(Coord coord) {

    }
}