
public class Main {
    public static void main(String[] args) {

        Player[] players = new Player[]{
                new Player("Francisco"),
                new Player("Álvaro"),
                new Player("Miguel")
        };

        Game game = new Game(15,players);

        game.startGame();
    }
}