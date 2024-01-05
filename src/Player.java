public class Player {
    private final String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int maxNumber) {
        return RandomNumber.getRandom(maxNumber);
    }
}
