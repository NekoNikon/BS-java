
class Player {
    private boolean is_bot;
    private String name;
    private Ship[] ships;
    private Map map;
    public Player(boolean is_bot , String name) {
        this.is_bot = is_bot;
        this.name = name;

        this.map = new Map();
        
    }
}